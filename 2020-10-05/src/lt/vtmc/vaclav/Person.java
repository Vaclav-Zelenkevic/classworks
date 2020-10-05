package lt.vtmc.vaclav;

public class Person {
	private String name;
	private int age;
	private static String aboutPerson;
	static int countPerson = 0;
	
	public Person() {}
//		System.out.println("Hello World!");
//	}
	
//	public Person(String name) {
//		this.name = name;
//	}
//	
//	public Person(int age) {
//		this.age = age;
//	}
	
	public String getAboutPerson() {
		return aboutPerson;
	}
	
	public Person(String name, int age, String aboutPerson) {
		setName(name);
		setAge(age);
		this.aboutPerson = aboutPerson;
		countPerson++;
	}

	public void setName(String name) {
		if (name == null) { 
			this.name = "Default name";
			System.out.println("Name is NULL!");
		} else if (name.isEmpty()){
			System.out.println("Name is empty!");
		} else {
			this.name = name;
		}
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
			System.out.println("Age < 0");
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return this.name + ", " + this.name.length();
	}

	public int getAge() {
		return this.age;
	}

	public void speak() {
		System.out.println("My name is " + this.name + " and I'm " + this.age + " years old.");
	}

	public void hello() {
		System.out.println("Hello!");
	}

	public int calculateRetirement() {
		int years = 65 - this.age;
		return years;
//		System.out.println("Years left: " + years);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
