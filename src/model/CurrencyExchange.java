

package model;

import java.util.Currency;

public class CurrencyExchange {

    private String fromCurrency;
    private String toCurrency;
    private double exchangeRate;


    public CurrencyExchange() {
        fromCurrency = null;
        toCurrency = null;
        exchangeRate = 0.0;
    }

    public CurrencyExchange(String c1, String c2, double rate) {
        fromCurrency = c1;
        toCurrency = c2;
        exchangeRate = rate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
