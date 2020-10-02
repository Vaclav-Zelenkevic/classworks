package lt.vtmc.vaclav;

public class JavaObject {

	public static void main(String[] args) {
		Student agne = new Student("Agne", 24, true); // Created object with name agne
		Student vytautas = new Student("Vytautas", 26, true);
		
		Dorm dorm1 = new Dorm(3);
		
		dorm1.setStudent(agne);
		dorm1.setStudent(vytautas);
		dorm1.setStudent(vytautas);
		dorm1.setStudent(agne);
		System.out.println(dorm1);
		
	}
}
