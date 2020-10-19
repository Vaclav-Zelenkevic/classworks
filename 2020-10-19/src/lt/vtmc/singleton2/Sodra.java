package lt.vtmc.singleton2;

public class Sodra {

	public static void main(String[] args) {
		UserOne usr1 = new UserOne("Tomas", "Turto deklaracija");
		UserTwo usr2 = new UserTwo("Akvile", "Pajamu deklaracija");
		usr1.getDeclarationType();
		
		
		DatabaseConnect db = DatabaseConnect.getInstance();
		String result0 = db.getFromDb(0);
		System.out.println(result0);
		String result1 = db.getFromDb(1);
		System.out.println(result1);
	}

}
