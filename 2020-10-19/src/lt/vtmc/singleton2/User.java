package lt.vtmc.singleton2;

public abstract class User {
	private String name;
	private String declarationType;
	
	public User(String name, String declarationType) {
		this.name = name;
		this.declarationType = declarationType;
		DatabaseConnect db = DatabaseConnect.getInstance();
		db.writeToDb(declarationType);
		System.out.println(db);
	}
	
	abstract void getDeclarationType();
}
