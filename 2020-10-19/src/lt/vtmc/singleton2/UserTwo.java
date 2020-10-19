package lt.vtmc.singleton2;

public class UserTwo extends User{

	public UserTwo(String name, String declarationType) {
		super(name, declarationType);
	}

	@Override
	void getDeclarationType() {
		DatabaseConnect db = DatabaseConnect.getInstance();
		db.getFromDb(1);
	}

}
