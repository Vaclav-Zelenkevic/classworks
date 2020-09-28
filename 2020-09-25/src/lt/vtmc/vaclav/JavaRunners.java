package lt.vtmc.vaclav;

import java.util.Scanner;

public class JavaRunners {
	
	private static int runnerNumber = 0;
	private static Scanner getData = new Scanner(System.in);
	private static int fastRunnerTime = 100000;

	public static void main(String[] args) {
		
		getRunnerNumber();
		System.out.println(runnerNumber);
		int result = getRunnerTimes();
		System.out.println("Greiciausias: " + fastRunnerTime 
				+ " greit uz vid: " + (result/runnerNumber - fastRunnerTime));
	}
	
	private static int getRunnerTimes() {
		System.out.println(runnerNumber);
		int timeSum = 0;
		for (int i = 0; i < runnerNumber; i++) {
			System.out.println("Iveskite laika: ");
			int runnerTime = getData.nextInt();
			if(runnerTime < fastRunnerTime) {
				fastRunnerTime = runnerTime;	
			}
			timeSum += runnerTime;
		}
		System.out.println(timeSum);
		return timeSum;
	}

	public static void getRunnerNumber() {
		System.out.println("Kiek dalyvavo: ");
		runnerNumber = getData.nextInt();
	}
	
	
	

}
