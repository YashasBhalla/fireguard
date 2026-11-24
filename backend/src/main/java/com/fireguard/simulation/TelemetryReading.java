package com.fireguard.simulation;

import java.time.Instant;

public record TelemetryReading(String deviceId, double temperature, double humidity, double gasPpm,
                               double flameIndex, double distanceCm, double batteryPercent,
                               String state, String location, double predictedFireRiskPercent,
                               String riskBand, double temperatureTrendCPerHour,
                               double gasTrendPpmPerHour, int estimatedMinutesToWarning,
                               String predictionNote, Instant timestamp) { }
