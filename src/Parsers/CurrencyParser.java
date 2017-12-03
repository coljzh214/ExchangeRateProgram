package Parsers;

import model.CurrencyExchange;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Currency;

public class CurrencyParser {

    public void parseCurrency(String jsonResponse, Currency toCurrency) throws JSONException {

        JSONObject currency = new JSONObject(jsonResponse);
        String fromCurrencyCode = currency.getString("base");
        JSONObject rates = currency.getJSONObject("rates");
        Double exchangeRate = rates.getDouble(toCurrency.toString());

        CurrencyExchange ce = new CurrencyExchange();
        //ce.setFromCurrency();
        ce.setToCurrency(toCurrency);
        ce.setExchangeRate(exchangeRate);



    }
}

//{
//        "Realtime model.Currency Exchange Rate": {
//        "1. From_Currency Code": "USD",
//        "2. From_Currency Name": "United States Dollar",
//        "3. To_Currency Code": "JPY",
//        "4. To_Currency Name": "Japanese Yen",
//        "5. Exchange Rate": "112.12500000",
//        "6. Last Refreshed": "2017-12-02 21:56:18",
//        "7. Time Zone": "UTC"
//        }
//        }
