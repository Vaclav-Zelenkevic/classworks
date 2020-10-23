package lt.vtmc.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new FileReader("file.txt"))){
			String dataBox = "";
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}

}
