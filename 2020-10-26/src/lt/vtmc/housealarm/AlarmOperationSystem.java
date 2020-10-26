package lt.vtmc.housealarm;

public class AlarmOperationSystem {

	private final SensorController controller = new SensorController();
	private int alarmState = 0; // 0 - OFF, 1 - ON

	public void checkCode(int code) {
		int password = 12345;
		if (code != password) {
			System.out.println("Wrong code! Please reenter!");
			alarmState = 0;
		} else if (alarmState == 0) {
			if (!checkSensors()) {
				System.out.println("The code is OK! Alarm can't turn ON. Sensors error!");
				printBadSensors();
				alarmState = 0;
			} else {
				System.out.println("The code is OK! Alarm is turned ON!");
				alarmState = 1;
			}
		} else {
			System.out.println("The code is OK! Alarm is turned OFF!");
			alarmState = 0;
		}

	}

	private boolean checkSensors() {
		return controller.getBadSensors().isEmpty();
	}

	private void printBadSensors() {
		if (controller.getBadSensors().isEmpty()) {
			System.out.println("All sensors working!");
		} else {
			for (Sensor sensor : controller.getBadSensors()) {
				System.out.println(sensor.getClass().getSimpleName() + " " + sensor.getSensorNumber() + " -> "
						+ sensor.getSensorType() + " : " + sensor.getSensorState());
			}
		}
	}

}
