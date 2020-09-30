package lt.vtmc.vaclav;

import java.math.BigInteger;

public class FibonacciNumbers {

	public static void main(String[] args) {
		long number = 120000L;
		long start = System.currentTimeMillis();
		getFibonacciNumber(number);
		System.out.println("Time: " + ((System.currentTimeMillis() - start))/1000);
	}

	private static BigInteger getFibonacciNumber(long number) {
		// BigInteger
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for(int i = 2; i <= number; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return c;
	}

}
