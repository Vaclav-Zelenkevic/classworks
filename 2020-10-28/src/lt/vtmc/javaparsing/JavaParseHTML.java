package lt.vtmc.javaparsing;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JavaParseHTML {

	public static void main(String[] args) {
		String htmlFile = parseFile("Data/index.html"); // Path
		Document htmlDocument = Jsoup.parse(htmlFile);
		System.out.println(htmlDocument.title());
		Elements element = htmlDocument.getElementsByAttributeValueContaining("headline-lead", "Covid"); 
		System.out.println(element);
	}

	private static String parseFile(String htmlFilePath) {
		StringBuilder builder = new StringBuilder();
		try {
			List<String> lines = Files.readAllLines(Paths.get(htmlFilePath));
			lines.forEach(line -> builder.append(line + "\n"));
		} catch (Exception e) {
			
		}
		return builder.toString();
	}

}
