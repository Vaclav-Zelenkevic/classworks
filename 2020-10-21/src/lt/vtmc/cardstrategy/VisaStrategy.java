package lt.vtmc.cardstrategy;

public class VisaStrategy extends ValidationStrategy{

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = false;
		if (creditCard.getNumber().startsWith("4") && creditCard.getNumber().length() == 16) {
			isValid = true;
		}
		return isValid;
	}

}
