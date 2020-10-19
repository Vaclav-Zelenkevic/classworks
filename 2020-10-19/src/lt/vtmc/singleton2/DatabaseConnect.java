package lt.vtmc.singleton2;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnect {
	private static final DatabaseConnect JDBC = new DatabaseConnect();
	private static boolean initailization = false;
	private List<String> declarationTypes = new ArrayList<>();
	
	private DatabaseConnect() {}
	
	public static synchronized DatabaseConnect getInstance(){
		if (initailization) {
			return JDBC;
		}
		initailization = true;
		return JDBC;
	}
	
	public void writeToDb(String dt) {
		declarationTypes.add(dt);
	}
	
	public String getFromDb(int index) {
		return declarationTypes.get(index);
	}
	
}
