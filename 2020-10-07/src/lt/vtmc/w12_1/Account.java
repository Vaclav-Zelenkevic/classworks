package lt.vtmc.w12_1;

import java.math.BigDecimal;
import java.security.SecureRandom;

public class Account {
	private static long accountNumber = 464564564L;
	private String accountHolder;
	private BigDecimal accountTotal = BigDecimal.ZERO;
	private boolean operationStatus;
//	SecureRandom generate = new SecureRandom();

	public Account(String accountHolder) {
		setAccountNumber();
		setAccountHolder(accountHolder);
	}
	
	public void setAccountAmount(BigDecimal money) {
		this.accountTotal = accountTotal.add(money);
	}
	
	public void withdraw(BigDecimal money) {
		if (true) {
			
		}
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber() {
		accountNumber++;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		if (accountHolder == null) {
			System.out.println("Account not created because null!");
		} else if (accountHolder.isEmpty()) {
			System.out.println("Account not created because empty!");
		} else {
			System.out.println("Account created!");
			this.accountHolder = accountHolder;
		}
	}

	public BigDecimal getAccountTotal() {
		return accountTotal;
	}

	public boolean isOperationStatus() {
		return operationStatus;
	}

}
