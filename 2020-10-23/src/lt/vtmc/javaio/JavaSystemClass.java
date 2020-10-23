package lt.vtmc.javaio;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class JavaSystemClass {

	public static void main(String[] args) {
		String envVariable = System.getenv("OS");
		System.out.println(envVariable);
		InputStream inputStream = System.in; // ???
		System.out.println("Write an word ...");
		try {
			byte[] bt = inputStream.readNBytes(5); // ???
			System.out.println(Arrays.toString(bt));
			inputStream.close();
			int bt1 = inputStream.read();
			System.out.println(bt1);
		} catch (IOException e) {
			System.err.println("Big mistake!");
		}
	}

}
