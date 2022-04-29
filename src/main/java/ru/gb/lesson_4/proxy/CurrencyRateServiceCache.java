package ru.gb.lesson_4.proxy;

import java.util.Map;
import java.util.WeakHashMap;

public class CurrencyRateServiceCache implements CurrencyRateService {

    private final CurrencyRateService rateService;

    public CurrencyRateServiceCache(CurrencyRateService rateService) {
        this.rateService = rateService;
    }

    Map<Currency, Money> cache = new WeakHashMap<>();

    @Override
    public Money getCurrencyRate(Currency currency) {
        if (cache.get(currency) == null) {
            cache.put(currency, rateService.getCurrencyRate(currency));
        }
        return cache.get(currency);
    }
}
