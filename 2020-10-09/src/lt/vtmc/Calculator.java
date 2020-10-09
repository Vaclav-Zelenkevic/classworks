package lt.vtmc;

public class Calculator {
	private int num1;
	private int num2;

	public Calculator() {
	}

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int divide(int num1, int num2) {
		if (num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}

}
