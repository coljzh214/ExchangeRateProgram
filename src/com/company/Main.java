package com.company;

import Parsers.CurrencyParser;
import Providers.ExchangeRateProvider;
import org.json.JSONException;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static ExchangeRateProvider erp;
    public static CurrencyParser ce;

    public static void main(String[] args) {
        ce = new CurrencyParser();
        erp = new ExchangeRateProvider();
        try {
            URL url = erp.getURLCurrency("AUD");
            System.out.println(ce.parseCurrency(erp.getJSONFile(url), "USD"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
