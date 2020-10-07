package lt.vtmc.w12_1;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Account account1 = new Account("Tadas");
		System.out.println(account1.getAccountNumber());
		Account account2 = new Account("Akvile");
		System.out.println(account2.getAccountNumber());
		
		account1.setAccountAmount(BigDecimal.valueOf(100.0));
		System.out.println(account1.getAccountTotal());
	}

}
