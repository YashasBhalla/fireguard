package com.fireguard.robot;

import java.util.concurrent.atomic.AtomicReference;

public class FireRobot implements Robot {
    private final String unitId;
    private final AtomicReference<RobotState> state = new AtomicReference<>(RobotState.MONITORING);
    private volatile String lastCommand = "MONITOR";
    private volatile double speedMetresPerSecond;

    public FireRobot(String unitId) { this.unitId = unitId; }
    public String getUnitId() { return unitId; }
    public String getLastCommand() { return lastCommand; }
    public double getSpeedMetresPerSecond() { return speedMetresPerSecond; }
    public void setSpeedMetresPerSecond(double speed) { speedMetresPerSecond = Math.max(0, Math.min(2.8, speed)); }
    @Override public void move(String direction) { lastCommand = direction; state.set(RobotState.MOVING); }
    @Override public boolean detectFire(double flameIndex, double temperatureC) {
        boolean detected = flameIndex > 850 || temperatureC > 55;
        if (detected) state.set(RobotState.FIRE_DETECTED);
        return detected;
    }
    @Override public void extinguishFire() { lastCommand = "PUMP_ON"; state.set(RobotState.SUPPRESSING); }
    @Override public void stop() { lastCommand = "STOP"; speedMetresPerSecond = 0; state.set(RobotState.STOPPED); }
    public void emergencyStop() { lastCommand = "ESTOP"; speedMetresPerSecond = 0; state.set(RobotState.EMERGENCY_STOP); }
    public RobotState getState() { return state.get(); }
}
