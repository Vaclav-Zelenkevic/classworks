package lt.vtmc.exceptions;

import java.io.IOException;

public class JavaExceptionOne {

	private static int x = 10;
	private static int y = 0;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		divide(); // unchecked
		try { // checked
			getConnection();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void divide() throws ArithmeticException{ // Bad practice
//		try {
//			if (y == 0) {
//				throw new ArithmeticException("Y can't be 0");
//			}
			System.out.println(x / y);
			
//		} catch (ArithmeticException e) {
//			System.out.println("Error: " + e.getMessage());
//		}		
	}
	
	
	public static boolean getConnection() throws IOException{
		// TODO Connect to HDD
		return false;
	}

}
