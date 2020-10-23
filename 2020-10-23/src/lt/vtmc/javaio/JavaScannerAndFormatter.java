package lt.vtmc.javaio;

import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaScannerAndFormatter {

	public static void main(String[] args) {
		try (Formatter formatter = new Formatter("BankAccount.txt")){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter: id, clientName, accountBalance");
			int counter = 0;
			while (counter < 3) {
				try {
					formatter.format("%d\t %s\t %.2f\n", 
							scanner.nextInt(), scanner.next(), scanner.nextFloat());
					counter++;
				} catch (InputMismatchException e) {
					System.out.println("Input is incorrect! Please try again!");
					scanner.nextLine();
				}
			}
//			formatter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
