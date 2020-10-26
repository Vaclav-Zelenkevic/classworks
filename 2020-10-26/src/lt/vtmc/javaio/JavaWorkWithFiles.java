package lt.vtmc.javaio;

import java.io.File;
import java.io.IOException;

public class JavaWorkWithFiles {

	public static void main(String[] args) {
		File file = new File("Data/wiki.txt");	
		try {
			getFileInfo(file);
			createNewFile();
			createNewFileWithFiles();
			createNewDirectory();
			createTmpFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createNewFileWithFiles() {
		// TODO		
	}

	private static void createTmpFile() throws IOException {
		File tempFile = File.createTempFile("mytmpfile", ".txt");
		System.out.println("File path: " + tempFile.getAbsolutePath());
	}

	private static void createNewDirectory() {
		File directory = new File("Data/OtherDir");
		boolean result = directory.mkdir();
		System.out.println("Directory created: " + result);
	}

	private static void createNewFile() throws IOException {
		File file = new File("Data/mano.txt");
		boolean result = file.createNewFile();
		System.out.println("File created: " + result);
	}

	private static void getFileInfo(File file) {
		System.out.println("File lenght: " + file.length());
		System.out.println("File path: " + file.getPath());
		System.out.println("File absolute path: " + file.getAbsolutePath());
		System.out.println("File can execute: " + file.canExecute());
		System.out.println("File can read: " + file.canRead());
		System.out.println("File can write: " + file.canWrite());
	}

}
