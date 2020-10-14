package lt.vtmc.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VectorTest {

	public Vector vector;

	@BeforeEach
	void createNewVector() {
		vector = new Vector();
	}

	@Test
	void newVectorShouldHaveZeroLenght() {
		assertEquals(0, vector.getLenght(), 1e-15);
	}
	
	@Test
	void newVectorShouldHaveZeroX() {
		assertEquals(0, vector.getX());
	}
	
	@Test
	void newVectorShouldHaveZeroY() {
		assertEquals(0, vector.getY());
	}
	
	

}
