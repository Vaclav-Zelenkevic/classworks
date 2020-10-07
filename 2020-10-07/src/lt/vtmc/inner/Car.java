package lt.vtmc.inner;

public class Car {
	private String model;
	private int year;
	private boolean isDrive;
//	Engine engine;
	
	public Car(String model, int year, boolean isDrive) {
		this.model = model;
		this.year = year;
		this.isDrive = isDrive;
//		this.engine = new Engine("Electrical", 100);
	}
	
	public void startCar() {
		Engine engine = new Engine("Dysoline", 120);
		engine.startEngine();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isDrive() {
		return isDrive;
	}

	public void setDrive(boolean isDrive) {
		this.isDrive = isDrive;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", isDrive=" + isDrive + "]";
	}
	
	class Engine {
		private String type;
		private double power;
		
		public Engine(String type, double power) {
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
	
}
