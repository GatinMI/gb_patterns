package ru.gb.lesson_4.proxy;

import java.util.HashMap;
import java.util.Map;

public class CurrencyRateServiceImpl implements CurrencyRateService {

    private Map<Currency, Money> currencies = new HashMap<>();

    {
        currencies.put(Currency.EURO, new Money(78));
        currencies.put(Currency.DOLLAR, new Money(71));
    }

    @Override
    public Money getCurrencyRate(Currency currency) {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {

        }
        return currencies.get(currency);
    }
}
