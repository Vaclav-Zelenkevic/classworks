package lt.vtmc;

public class DivideByZeroException extends Exception{
	public DivideByZeroException(String errorMessage) {
		System.out.println(errorMessage);
	}
}
