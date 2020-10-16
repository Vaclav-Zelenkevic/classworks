package lt.vtmc.examone;

import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConversionException;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.Money;

public class CurrencyConverterImplementation implements CurrencyConverter {

    private final CurrencyRatesProvider currencyRatesProvider;

	public CurrencyConverterImplementation(CurrencyRatesProvider currencyRatesProvider) {
    	this.currencyRatesProvider = currencyRatesProvider;
    }

    @Override
    public Money convert(Currency from, Currency to, Money amount) {
    	Money rate = currencyRatesProvider.getRate(from, to);
    	if (rate == null) {
    		throw new CurrencyConversionException("Could not convert currency ...");
    	}
        return amount.multiply(rate);
    }
}
