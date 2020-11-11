package lt.vtmc.javadoc;

/**
 * Person class with parameters <b>name</b> and <b>age</b>
 * 
 * @author Vaclav Zelenkevic
 * @version 1.0
 */

/*
 * If API!!! -> javadoc
 */

public class Person {

	/** Name field */
	private String name;
	/** Age field */
	private int age;

	/**
	 * Default constructor for create new Person object.
	 * 
	 * @see Person#Person(String, int)
	 */
	public Person() {
	}

	/**
	 * Constructor for create Person objects with parameters.
	 * 
	 * @param name Person name
	 * @param age  Person age
	 * @see Person#Person()
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Method for get {@link Person#name} value
	 * 
	 * @return returns the Person name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method for set {@link Person#name} value
	 * 
	 * @throws NullPointerException if {@code name} is null
	 */
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException();
		} else {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
