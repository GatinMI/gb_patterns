package ru.gb.lesson_4.proxy;

import org.springframework.context.annotation.Bean;

public class ProxyClient {
    public static void main(String[] args) {
        CurrencyRateService currencyRateService = getCurrencyRateService();
        System.out.println(currencyRateService.getCurrencyRate(Currency.DOLLAR));

        System.out.println(currencyRateService.getCurrencyRate(Currency.EURO));
        System.out.println(currencyRateService.getCurrencyRate(Currency.DOLLAR));

        System.out.println(currencyRateService.getCurrencyRate(Currency.EURO));
    }

    @Bean
    private static CurrencyRateService getCurrencyRateService() {
        return new CurrencyRateServiceCache(new CurrencyRateServiceImpl());
    }
}
