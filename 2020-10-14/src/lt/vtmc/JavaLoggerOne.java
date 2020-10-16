package lt.vtmc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class JavaLoggerOne {

	public static void main(String[] args) {
		System.out.println();
		try {
			System.setErr(new PrintStream(new File("Error.log")));
			System.err.println("Error message 1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			throw new Exception("Error message ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Labas ...");
		
		myMethod();
	}

	private static void myMethod() {
		System.err.println("Error message 2");		
	}

}
