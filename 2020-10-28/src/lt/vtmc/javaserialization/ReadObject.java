package lt.vtmc.javaserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("people.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)){
//			Person person1 = (Person) ois.readObject();
//			Person person2 = (Person) ois.readObject();
//			Person person3 = (Person) ois.readObject();
			
			Person[] humans = (Person[]) ois.readObject();
			
//			System.out.println(person1);
//			System.out.println(person2);
//			System.out.println(person3);
			System.out.println(Arrays.toString(humans));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
