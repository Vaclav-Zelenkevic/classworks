package lt.vtmc.generics;

public class JavaGenericsClass {

	public static void main(String[] args) {
		Name name = new Name(1, "Tomas");
		System.out.println(name.getValue());
		Age<Integer, String> integerAge = new Age<>(1, "Ten");
		System.out.println(integerAge.getValue());
		Age<Double, String> doubleAge = new Age<>(2.0, "12.0");
		System.out.println(doubleAge);
	}

}
