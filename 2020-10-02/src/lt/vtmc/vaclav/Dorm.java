package lt.vtmc.vaclav;

import java.util.Arrays;

public class Dorm {
	String address;
	int roomsNumber;
	int roomNumber;
	Student[] students;

	Dorm(int roomsNumber) {
		this.roomsNumber = roomsNumber;
		students = new Student[roomsNumber];
	}

//	Dorm(int roomsNumber, Student[] students){
//		this.roomsNumber = roomsNumber;
//		this.students = students;
//	}

	public void setStudent(Student student) {
		if (roomNumber < roomsNumber) {
			students[roomNumber] = student; // 45
			roomNumber++;
		} else {
			System.out.println(student + " atsiprasome - nera vietu ...");
		}
	}

	@Override
	public String toString() {
		return "Dorm [students=" + Arrays.toString(students) + "]";
	}

}
