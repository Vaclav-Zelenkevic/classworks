package lt.vtmc.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaRuntime {

	public static void main(String[] args) {
		try {
			Process process = Runtime.getRuntime().exec("ping delfi.lt");
			prinResults(process);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void prinResults(Process process) throws IOException {
		FileWriter fw = new FileWriter("result.txt");
		BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(process.getInputStream()));
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			fw.write(line + "\n");
		}
	}

}
