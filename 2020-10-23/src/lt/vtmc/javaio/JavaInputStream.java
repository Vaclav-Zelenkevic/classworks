package lt.vtmc.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaInputStream {

	public static void main(String[] args) throws IOException {
		try (InputStream is = new FileInputStream("file.txt")) {
			int byteNumber = 0;
			while ((byteNumber = is.read()) != -1) {
//				char chars = (char)byteNumber;
//				System.out.print(chars);
				System.out.print(byteNumber + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
