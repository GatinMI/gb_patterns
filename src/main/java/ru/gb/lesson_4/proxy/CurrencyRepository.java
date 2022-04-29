package ru.gb.lesson_4.proxy;

public interface CurrencyRepository {

    Money getRate(Currency currency);
}
