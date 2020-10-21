package lt.vtmc.cardstrategy;

public class Main {

	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard(new VisaStrategy());
		creditCard.setNumber("455544444444444");
		System.out.println(creditCard.isValid());
	}

}
