package lt.vtmc.exceptions;

import java.io.IOException;

public class JavaExceptionThree {
	public static void main(String[] args) {
		try {
			readFile("path/to/file");
		} catch (IOException | BadFileFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static String readFile(String path) throws IOException, BadFileFormatException{
		return null;
	}
}
