package lt.vtmc.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JavaReadFileWithScannerAndSplitter {

	public static void main(String[] args) {
		readFileWithScanner();
		createWordsArrayWithScannerFromFile();
	}

	private static void createWordsArrayWithScannerFromFile() {
		File file = new File("Data/wiki.txt");
		try (Scanner scanner = new Scanner(file)){
			String line = scanner.nextLine();
			String[] words = line.split("\\s+");
			System.out.println(Arrays.toString(words));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

	private static void readFileWithScanner() {
		File file = new File("Data/file.txt");
		try (Scanner scanner = new Scanner(file)){
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

}
