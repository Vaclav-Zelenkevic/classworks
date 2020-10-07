package lt.vtmc.inner;

public class Engine {
	private String type;
	private double power;
	
	public Engine(String type, double power) {
		super();
		this.type = type;
		this.power = power;
	}
	
	public void startEngine() {
		System.out.println("Engine started ...");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", power=" + power + "]";
	}

}
