package lt.vtmc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StreamsReader {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean pr = true;
		
		do {
			try {
				System.out.println("Please input number: ");
				int x = input.nextInt();
				pr = false;
				print(x);
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		} while(pr);
	}
	
	public static void print(int number) {
		System.out.println(number);
	}

}
