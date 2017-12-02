package com.company;

import Providers.ExchangeRateProvider;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) {

        try {
            ExchangeRateProvider.getURLCurrency("USD");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
