package lt.vtmc.examone;

import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.List;

public class BankImplementation implements Bank {

    private final CurrencyConverter currencyConverter;
    private final List<Customer> customers;
    private SequenceGenerator customerSequence = new SequenceGenerator();
    private SequenceGenerator accountSequence = new SequenceGenerator();

    public BankImplementation(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
        this.customers = new ArrayList<>();
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (personCode == null || personName == null){
            throw new NullPointerException();
        }

        for (Customer customer : customers) {
            if (customer.getPersonCode().equals(personCode)){
                throw new CustomerCreateException("Customer already exists ...");
            }
        }

        Customer customer = new Customer(customerSequence.getNext(), personCode, personName);
        customers.add(customer);

        return customer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (customer == null || currency == null){
            throw new NullPointerException();
        }
        if (!customers.contains(customer)){
            throw new CustomerCreateException("Customer does not exist ...");
        }

        Account account = new Account(accountSequence.getNext(), customer, currency, new Money(0.0d));
        customer.addAccount(account);
        return account;
    }

    @Override
    public Operation transferMoney(Account debitAccount, Account creditAccount, Money debitAmount) {
        if (debitAccount.getBalance().isLessThan(debitAmount)){
            throw new InsufficientFundsException("You are bad customer!");
        }
        debitAccount.setBalance(debitAccount.getBalance().substract(debitAmount));
        // TODO
        return null;
    }

    @Override
    public Money getBalance(Currency currency) {
        return null;
    }
}
