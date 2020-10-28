package lt.vtmc.javaserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args){
		Person person1 = new Person(1, "Tomas");
		Person person2 = new Person(2, "Teddy");
		Person person3 = new Person(3, "Akvile");
		
		Person[] persons = {person1, person2, person3};
		
		try (FileOutputStream fos = new FileOutputStream("people.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
//			oos.writeObject(person1);
//			oos.writeObject(person2);
//			oos.writeObject(person3);
			oos.writeObject(persons);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
