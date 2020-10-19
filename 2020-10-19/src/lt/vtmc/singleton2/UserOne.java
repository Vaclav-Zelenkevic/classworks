package lt.vtmc.singleton2;

public class UserOne extends User{

	public UserOne(String name, String declarationType) {
		super(name, declarationType);
	}

	@Override
	void getDeclarationType() {
		DatabaseConnect db = DatabaseConnect.getInstance();
		db.getFromDb(0);
	}

}
