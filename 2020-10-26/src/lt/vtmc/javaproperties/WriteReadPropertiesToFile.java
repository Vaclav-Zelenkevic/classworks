package lt.vtmc.javaproperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class WriteReadPropertiesToFile {

	public static void main(String[] args) {
		writePropertiesToFile();
		readPropertiesFromFile();
		writePropertiesToXMLFile();
		readPropertiesFromXMLFile();
	}

	private static void readPropertiesFromFile() {
		try {
			Properties prop = new Properties();
			InputStream is = new FileInputStream("myprop.properties");
			prop.load(is);
			System.out.println("Name:" + prop.getProperty("name"));
			System.out.println("Surname: " + prop.getProperty("surname"));
		} catch (Exception e) {
		}
	}

	private static void writePropertiesToFile() {
		try (OutputStream os = new FileOutputStream("myprop.properties")) {
			Properties prop = new Properties();
			prop.setProperty("name", "Tadas");
			prop.setProperty("surname", "Tadinskas");
			prop.setProperty("age", "45");
			prop.store(os, "Dynamic properties file");
		} catch (Exception e) {
		}
	}
	
	private static void readPropertiesFromXMLFile() {
		try {
			Properties prop = new Properties();
			InputStream is = new FileInputStream("myprop.xml");
			prop.loadFromXML(is);
			System.out.println("Name:" + prop.getProperty("name"));
			System.out.println("Surname: " + prop.getProperty("surname"));
		} catch (Exception e) {
		}
	}

	private static void writePropertiesToXMLFile() {
		try (OutputStream os = new FileOutputStream("myprop.xml")) {
			Properties prop = new Properties();
			prop.setProperty("name", "Tadas");
			prop.setProperty("surname", "Tadinskas");
			prop.setProperty("age", "45");
			prop.storeToXML(os, "Dynamic XML properties file");
		} catch (Exception e) {
		}
	}

}
