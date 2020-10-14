package lt.vtmc.junit;

public class Calculator {

	
	
	public static double divide(int number1, int number2) {
		if (number2 == 0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		return number1 / number2;
	}

	public static double sum(double number1, double number2) {
		return number1 + number2;
	}
	
}