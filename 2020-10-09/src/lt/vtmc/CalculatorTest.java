package lt.vtmc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void divideTest() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.divide(10, 5));
	}
	
	@Test
	void divideByZeroTest() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.divide(10, 0));
	}

}
