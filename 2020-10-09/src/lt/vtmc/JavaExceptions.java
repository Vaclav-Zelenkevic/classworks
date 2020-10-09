package lt.vtmc;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptions {

	public static void main(String[] args) throws DivideByZeroException {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Input first number: ");
			int x = input.nextInt();
			System.out.println("Input second number: ");
			int y = input.nextInt();
			if (y == 0) {
				throw new DivideByZeroException("Input Error");
			} else {
				System.out.println(devide(x, y));
			}	
		} catch (InputMismatchException | ArithmeticException e) {
			e.printStackTrace();
//			System.out.println("Big ERROR!");
		} finally {
			input.close();
			System.out.println("Finally working ...");
		}
	}

	public static int devide(int x, int y) throws ArithmeticException{ // unchecked
		//		if (y == 0) {
//			System.out.println("Error: divide by zero!");
//			return 0;
//		} else {
			return x / y;
//		}
	}
}
