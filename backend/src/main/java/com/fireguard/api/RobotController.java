package com.fireguard.api;

import com.fireguard.robot.FireRobot;
import com.fireguard.simulation.RobotSimulator;
import com.fireguard.simulation.TelemetryReading;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import java.util.Deque;
import java.util.Map;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RobotController {
    private final RobotSimulator simulator;
    public RobotController(RobotSimulator simulator) { this.simulator = simulator; }

    @GetMapping("/telemetry/latest")
    public TelemetryReading latest(@RequestParam(defaultValue = "IGNIS-F01") String deviceId) {
        return simulator.latest();
    }
    @GetMapping("/telemetry") public Deque<TelemetryReading> history() { return simulator.history(); }
    @PostMapping("/robot/{id}/command")
    public Map<String, Object> command(@PathVariable String id, @Valid @RequestBody CommandRequest request) {
        FireRobot robot = simulator.robot();
        String type = request.type().toUpperCase();
        if (type.equals("ESTOP") || type.equals("BRAKE") || type.equals("STOP")) robot.emergencyStop();
        else if (type.startsWith("DRIVE")) robot.move(type);
        else if (type.equals("PUMP_ON") || type.equals("DISCHARGE")) robot.extinguishFire();
        return Map.of("deviceId", id, "command", type, "state", robot.getState().name(), "accepted", true);
    }
    @PostMapping("/dev/simulate-fire")
    public Map<String, String> simulateFire() { simulator.startFireScenario(); return Map.of("status", "started", "deviceId", "IGNIS-F01"); }
    @PostMapping("/ingest")
    public Map<String, String> ingest(@RequestBody Map<String, Object> payload) {
        return Map.of("status", "accepted", "note", "Hardware ingestion contract stub");
    }
    public record CommandRequest(@NotBlank String type) { }
}
