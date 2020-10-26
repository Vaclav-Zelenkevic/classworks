package lt.vtmc.housealarm;

public abstract class Sensor {
	private int sensorNumber;
	private String sensorType;
	private boolean sensorState;
	
	public Sensor(int sensorNumber, String sensorType, boolean sensorState) {
		setSensorNumber(sensorNumber);
		setSensorType(sensorType);;
		setSensorState(sensorState);
	}

	public int getSensorNumber() {
		return sensorNumber;
	}

	public void setSensorNumber(int sensorNumber) {
		if (sensorNumber < 0) {
			throw new IllegalArgumentException("Bad sensor number");
		}
		this.sensorNumber = sensorNumber;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		if (sensorType == null) {
			throw new NullPointerException("Sensor do not detected!");
		}
		if (sensorType.equals("")) {
			throw new IllegalArgumentException("Bad sensor type!");
		}
		this.sensorType = sensorType;
	}

	public boolean getSensorState() {
		return sensorState;
	}

	private void setSensorState(boolean sensorState) {
		this.sensorState = sensorState;
	}

	@Override
	public String toString() {
		return "Sensor [sensorNumber=" + sensorNumber + ", sensorType=" + sensorType + ", sensorState=" + sensorState
				+ "]";
	}
	
}
