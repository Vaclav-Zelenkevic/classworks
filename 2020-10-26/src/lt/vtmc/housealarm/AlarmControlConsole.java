package lt.vtmc.housealarm;

import java.util.Scanner;

public class AlarmControlConsole {

	public static void main(String[] args) {
		AOSAPI myAlarm = new AOSAPI();
		Scanner scanner = new Scanner(System.in);
		int code = 0;
		while (code != 10) {
			System.out.println("Enter code: ");
			code = scanner.nextInt();
			myAlarm.enterCode(code);
		}
		scanner.close();
	}

}
