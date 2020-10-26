package lt.vtmc.housealarm;

import java.util.ArrayList;
import java.util.List;

public class SensorController {

	private final List<Sensor> windowSensors = new ArrayList<>();
	private final List<Sensor> doorSensors = new ArrayList<>();
	private final List<Sensor> fireSensors = new ArrayList<>();
	private List<Sensor> badSensor = new ArrayList<>();
	
	public SensorController() {
		initializeWindowSensors();
		initializeDoorSensors();
		initializeFireSensors();
		collectBadSensors();
	}

	private void initializeFireSensors() {
		windowSensors.add(new WindowSensor(1, "Glass brake sensor", false));
		windowSensors.add(new WindowSensor(2, "Magnetic sensor", true));
	}

	private void initializeDoorSensors() {
		doorSensors.add(new DoorSensor(1, "Magnetic sensor", true));
		doorSensors.add(new DoorSensor(2, "Magnetic sensor", false));
	}

	private void initializeWindowSensors() {
		fireSensors.add(new FireSensor(1, "Flame sensor", false));
		fireSensors.add(new FireSensor(2, "Photoelectric sensor", true));
	}
	
	private void collectBadSensors() {
		for (Sensor ws : windowSensors) {
			if (!ws.getSensorState()) {
				badSensor.add(ws);
			}
		}
		
		for (Sensor ds : doorSensors) {
			if (!ds.getSensorState()) {
				badSensor.add(ds);
			}
		}
		
		for (Sensor fs : fireSensors) {
			if (!fs.getSensorState()) {
				badSensor.add(fs);
			}
		}
	}
	
	public List<Sensor> getBadSensors() {
		return badSensor;
	}

	
}
