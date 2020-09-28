package lt.vtmc.vaclav;

public class JavaNumbersSwapping {

	public static void main(String[] args) {
		int numberOne = 5;
		int numberTwo = 2;
		System.out.println(numberOne + ", " + numberTwo);
		numberChangerOne(numberOne, numberTwo);
		numberChangerTwo(numberOne, numberTwo);
		numberChangerThree(numberOne, numberTwo);
		numberChangerFour(numberOne, numberTwo);
	}
	
	static void numberChangerOne(int numberOne, int numberTwo){
		int tmp = numberOne;
		numberOne = numberTwo;
		numberTwo = tmp;
		System.out.println(numberOne + ", " + numberTwo);
	}
	
	static void numberChangerTwo(int numberOne, int numberTwo){
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		System.out.println(numberOne + ", " + numberTwo);
	}
	
	static void numberChangerThree(int numberOne, int numberTwo){
		numberOne = numberOne * numberTwo;
		numberTwo = numberOne / numberTwo;
		numberOne = numberOne / numberTwo;
		System.out.println(numberOne + ", " + numberTwo);
	}
	
	static void numberChangerFour(int numberOne, int numberTwo){
		numberOne = numberOne ^ numberTwo; // 101 ^ 010
		numberTwo = numberOne ^ numberTwo; // 111 ^ 010
		numberOne = numberOne ^ numberTwo;
		System.out.println(numberOne + ", " + numberTwo);
	}

}
