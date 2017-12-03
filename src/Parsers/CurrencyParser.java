package Parsers;

import model.CurrencyExchange;
import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyParser {
    private CurrencyExchange ce;

    public Double parseCurrency(String jsonResponse, String toCurrencyCode) throws JSONException {

        JSONObject currency = new JSONObject(jsonResponse);
        String fromCurrencyCode = currency.getString("base");
        JSONObject rates = currency.getJSONObject("rates");
        Double exchangeRate = rates.getDouble(toCurrencyCode.toString());

        ce = new CurrencyExchange();
        ce.setFromCurrency(fromCurrencyCode);
        ce.setToCurrency(toCurrencyCode);
        ce.setExchangeRate(exchangeRate);

        return exchangeRate;
    }
}

