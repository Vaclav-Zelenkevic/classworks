package lt.vtmc.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void zeroDeviderShouldThrowException() {
		Exception exception = assertThrows(ArithmeticException.class, () -> {
			Calculator.divide(1, 0);
		});
		System.out.println(exception);
	}
	
	@Test
	void twoNumbersShouldSum() {
		assertEquals(4.0, Calculator.sum(2.0, 2.0), 1e-5);
	}

}
