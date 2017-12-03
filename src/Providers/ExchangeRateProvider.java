package Providers;

import javax.xml.ws.spi.http.HttpHandler;
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
    String toCurrency;
    String key;

    protected URL getURL(String fromCurrency, String toCurrency) throws MalformedURLException {

        String request;
        String TAG = HttpHandler.class.getSimpleName();

        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.key = null;

        request = "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency= " + fromCurrency + "&to_currency=" + toCurrency + "&apikey=" + key;

        return new URL(request);
    }
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
