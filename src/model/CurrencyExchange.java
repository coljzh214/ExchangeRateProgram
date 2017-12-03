

package model;

import java.util.Currency;

public class CurrencyExchange {

    private Currency fromCurrency;
    private Currency toCurrency;
    private double exchangeRate;


    public CurrencyExchange() {
        fromCurrency = null;
        toCurrency = null;
        exchangeRate = 0.0;
    }

    public CurrencyExchange(Currency c1, Currency c2, double rate) {
        fromCurrency = c1;
        toCurrency = c2;
        exchangeRate = rate;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
