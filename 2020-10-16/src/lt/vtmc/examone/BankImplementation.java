package lt.vtmc.examone;

import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.List;

public class BankImplementation implements Bank {

	private final CurrencyConverter currencyConverter;
	private final List<Customer> customers;
	private SequenceGenerator customerSequence = new SequenceGenerator();
	private SequenceGenerator accountSequence = new SequenceGenerator();
	private SequenceGenerator operationSequence = new SequenceGenerator();

	public BankImplementation(CurrencyConverter currencyConverter) {
		this.currencyConverter = currencyConverter;
		this.customers = new ArrayList<>();
	}

	@Override
	public Customer createCustomer(PersonCode personCode, PersonName personName) {
		if (personCode == null || personName == null) {
			throw new NullPointerException();
		}

		for (Customer customer : customers) {
			if (customer.getPersonCode().equals(personCode)) {
				throw new CustomerCreateException("Customer already exists ...");
			}
		}

		Customer customer = new Customer(customerSequence.getNext(), personCode, personName);
		customers.add(customer);

		return customer;
	}

	@Override
	public Account createAccount(Customer customer, Currency currency) {
		if (customer == null || currency == null) {
			throw new NullPointerException();
		}
		if (!customers.contains(customer)) {
			throw new AccountCreateException("Customer does not exist ...");
		}

		Account account = new Account(accountSequence.getNext(), customer, currency, new Money(0.0d));
		customer.addAccount(account);
		return account;
	}

	@Override
	public Operation transferMoney(Account debitAccount, Account creditAccount, Money debitAmount) {
		// Check account balance
		if (debitAccount.getBalance().isLessThan(debitAmount)) {
			throw new InsufficientFundsException("You are bad customer!");
		}
		// debitAccount - debitAmount
		debitAccount.setBalance(debitAccount.getBalance().substract(debitAmount));
		// Convert money from debitAmount currency to creditAccount currency
		final Money creditAmount = currencyConverter.convert(debitAccount.getCurrency(), creditAccount.getCurrency(),
				debitAmount);
		// debitAmount transfer to creditAccount
		creditAccount.setBalance(creditAccount.getBalance().add(creditAmount));
		// Return Operation object with operation details
		return new Operation(operationSequence.getNext(), debitAccount, creditAccount, debitAmount);
	}

	@Override
	public Money getBalance(Currency currency) {
		// Create balance object for customer money
		Money balance = new Money(0.0d);
		// Iterate by customers list
		for (Customer customer : customers) {
			// Get all accounts from customer
			for (Account account : customer.getAccounts()) {
				if(account.getCurrency().equals(currency)) {
					balance = balance.add(account.getBalance());
				} else {
					balance = balance.add(currencyConverter.convert(account.getCurrency(), currency, account.getBalance()));
				}
			}
		}
		return balance;
	}
}
