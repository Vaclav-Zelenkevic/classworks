package lt.vtmc.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JavaReadFileWithUTF {

	public static void main(String[] args) {
		List<String> result = new ArrayList<String>();
		try (InputStreamReader input = new InputStreamReader(
				new FileInputStream("file.txt"), StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(input);
				OutputStreamWriter output = 
						new OutputStreamWriter(
								new FileOutputStream("newfile.txt"), StandardCharsets.UTF_8)){
			String line = "";
			while ((line = br.readLine()) != null) {
				result.add(line);
				output.write(line);
				output.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
}
