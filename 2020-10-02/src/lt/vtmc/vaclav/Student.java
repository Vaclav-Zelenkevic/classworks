package lt.vtmc.vaclav;

public class Student {
	private String name; // State
	private int age;
	boolean testResult;
	
	Student(){}
	
	Student(String name, int age, boolean testResult){
		this.name = name;
		this.age = age;
		this.testResult = testResult;
	}
	
	void canRegister() { // Behavior
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", testResult=" + testResult + "]";
	}
	
	

}
