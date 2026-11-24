# Java OOP mapping

| Concept | Implementation | Location |
|---|---|---|
| Interface / abstraction | `Robot` defines movement, detection, suppression and stop operations | `backend/src/main/java/com/fireguard/robot/Robot.java` |
| Encapsulation | `FireRobot` keeps state private and clamps speed to 0–2.8 m/s | `backend/src/main/java/com/fireguard/robot/FireRobot.java` |
| Classes and objects | `FireRobot` is the simulated IGNIS unit | `backend/src/main/java/com/fireguard/robot/FireRobot.java` |
| Collections | `RobotSimulator` retains recent readings in a bounded `Deque` | `backend/src/main/java/com/fireguard/simulation/RobotSimulator.java` |
| Control flow | Fire threshold check uses flame > 850 or temperature > 55 °C | `backend/src/main/java/com/fireguard/robot/FireRobot.java` |
| Scheduling / simulation | Periodic telemetry plus scripted fire scenario | `backend/src/main/java/com/fireguard/simulation/RobotSimulator.java` |
| REST API | Telemetry, commands, ingest stub and scenario trigger | `backend/src/main/java/com/fireguard/api/RobotController.java` |

The current backend milestone is the simulator/API foundation. Sensor and navigation class hierarchies, persistence, authentication, WebSocket messaging and corresponding unit tests remain follow-up work.
