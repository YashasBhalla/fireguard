package com.fireguard.robot;

public interface Robot {
    void move(String direction);
    boolean detectFire(double flameIndex, double temperatureC);
    void extinguishFire();
    void stop();
    RobotState getState();
}
