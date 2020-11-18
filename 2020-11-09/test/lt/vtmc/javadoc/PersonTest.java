package lt.vtmc.javadoc;

import static org.junit.Assert.*;

import org.junit.Test;

import lt.vtmc.functional.Person;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person("Tadas", 25);
		assertEquals("Tadas", person.getName());
	}

}
