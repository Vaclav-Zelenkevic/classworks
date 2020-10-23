package lt.vtmc.javaio;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class JavaOutputStream {

	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("newfile.txt")) {
			String name = "Tomas";
			byte[] words = {102, 45, 78, 65, 123};
			os.write(words);
			os.write(name.getBytes());
		} catch (Exception e) {
			
		}
	}

}
