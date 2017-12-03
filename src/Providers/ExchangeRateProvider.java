package Providers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by john_ on 2017-12-02.
 */
public class ExchangeRateProvider {

    String fromCurrency;
    String key;
    String[] currencies = {"AUD", "BGN", "BRL", "CAD", "CHF", "CNY", "CZK", "DKK", "GBP", "HKD", "HRK", "HUF", "IDR", "ILS", "INR", "JPY", "KRW", "MXN", "MYR", "NOK", "NZD", "PHP", "PLN", "RON", "RUB", "SEK", "SGD", "THB", "TRY", "ZAR", "EUR"};

    public static URL getURLCurrency(String fromCurrency) throws MalformedURLException {

        String request;

        request = "https://api.fixer.io/latest?base=" + fromCurrency;

        return new URL(request);
    }

<<<<<<< HEAD
=======

>>>>>>> b639fde87c71eaa19b7fca687bc80e7c2ce8064d
    public String getJSONFile (String reqUrl) {
        BufferedReader reader = null;
        try {
            URL url = new URL(reqUrl);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        return null;
    }



}
