package com.fireguard.simulation;

import com.fireguard.robot.FireRobot;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RobotSimulator {
    private final FireRobot robot = new FireRobot("IGNIS-F01");
    private final Deque<TelemetryReading> readings = new ArrayDeque<>();
    private volatile boolean fireScenario;
    private volatile int scenarioTick;
    private int sampleCount;
    private volatile TelemetryReading latest = sample(28.4, 42, 0, "MONITORING");

    @Scheduled(fixedRate = 2000)
    public synchronized void tick() {
        sampleCount++;
        // Repeating, deterministic demo drift makes the trend tiles and charts feel alive.
        double temp = 27.8 + Math.sin(sampleCount / 7.0) * 1.8 + Math.sin(sampleCount / 19.0) * 0.7;
        double gas = 39 + Math.sin(sampleCount / 9.0) * 8 + Math.cos(sampleCount / 17.0) * 4;
        double flame = 0;
        String state = robot.getState().name();
        if (fireScenario) {
            scenarioTick++;
            if (scenarioTick < 4) { flame = 940; temp = 58 + scenarioTick * 2; state = "FIRE_DETECTED"; }
            else if (scenarioTick < 8) { flame = Math.max(40, 850 - scenarioTick * 100); temp = 62 - scenarioTick * 3.5; state = "SUPPRESSING"; }
            else { fireScenario = false; scenarioTick = 0; temp = 31; state = "MONITORING"; robot.stop(); }
        }
        latest = sample(temp, gas, flame, state);
        readings.addLast(latest);
        while (readings.size() > 120) readings.removeFirst();
    }
    private TelemetryReading sample(double temp, double gas, double flame, String state) {
        double risk = Math.min(98, Math.max(3, (temp - 25) * 1.2 + (gas - 35) * 0.24 + flame * 0.055));
        String band = risk >= 70 ? "HIGH" : risk >= 35 ? "ELEVATED" : "LOW";
        double tempTrend = fireScenario ? 3.6 : 0.18 + Math.sin(sampleCount / 6.0) * 0.22;
        double gasTrend = fireScenario ? 21 : Math.cos(sampleCount / 8.0) * 1.8;
        int minutes = tempTrend > 0.55 ? Math.max(8, (int) ((44.0 - temp) / tempTrend * 60)) : -1;
        String note = band.equals("HIGH") ? "Multiple simulated indicators elevated; review immediately."
                : band.equals("ELEVATED") ? "Demo trend is rising; monitor the next sensor samples."
                : "Demo baseline is stable; no near-term warning projected.";
        return new TelemetryReading("IGNIS-F01", temp, 42, gas, flame, 184, 96, state,
                "28.3602° N · 76.9366° E", risk, band, tempTrend, gasTrend, minutes, note, Instant.now());
    }
    public TelemetryReading latest() { return latest; }
    public synchronized Deque<TelemetryReading> history() { return new ArrayDeque<>(readings); }
    public FireRobot robot() { return robot; }
    public void startFireScenario() { scenarioTick = 0; fireScenario = true; }
}
