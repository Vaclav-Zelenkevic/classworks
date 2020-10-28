package lt.vtmc.javaparsing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JavaParseJson {

	public static void main(String[] args) {
		try {
			writeJsonObject();
			readJsoObject();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	private static void readJsoObject() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Data/JSonExample.json"));
		JSONObject jo = (JSONObject) obj;
		String firstName = (String) jo.get("firstName");
		System.out.println(firstName);
	}

	private static void writeJsonObject() throws FileNotFoundException {
		JSONObject jo = new JSONObject();
		jo.put("firstName", "Tomas"); // Map
		jo.put("lastName", "Tomukas");
		jo.put("age", "30");
		Map mapas = new LinkedHashMap(3);
		mapas.put("streetAddress", "Vilnius street");
		mapas.put("city", "Vilnius");
		mapas.put("postCode", "02455");
		jo.put("address", mapas);
		JSONArray ja = new JSONArray();
		ja.add(jo);
//		ja.add(mapas);
		PrintWriter pw = new PrintWriter("Data/JSonExample.json");
		pw.write(jo.toJSONString());
		pw.flush();
	}

}
