package lt.vtmc.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class JavaFileCopier {

	public static void main(String[] args) {
		String readFromFile = "foto.jpg";
		String writeToFile = "newfoto.jpg";
//		copyByteByByte(readFromFile, writeToFile);
//		copyCharByChar(readFromFile, writeToFile);
		copyLineByLine(readFromFile, writeToFile);
	}

	private static void copyByteByByte(String readFromFile, String writeToFile) {
		try (FileInputStream fis = new FileInputStream(readFromFile); 
				FileOutputStream fos = new FileOutputStream(writeToFile)) {
			int dataBox = 0;
			while ((dataBox = fis.read()) != -1) {
				System.out.print((char)dataBox);
				fos.write(dataBox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private static void copyCharByChar(String readFromFile, String writeToFile) {
		try (FileReader fr = new FileReader(readFromFile);
				FileWriter fw = new FileWriter(writeToFile) ) {
			int dataBox = 0;
			while ((dataBox = fr.read()) != -1) {
				System.out.print((char) dataBox);
				fw.write(dataBox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void copyLineByLine(String readFromFile, String writeToFile) {
		try (BufferedReader br = new BufferedReader(new FileReader(readFromFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(writeToFile))) {
			String dataBox = "";
			while ((dataBox = br.readLine()) != null) {
				System.out.println(dataBox);
				bw.write(dataBox + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
