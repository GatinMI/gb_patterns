package ru.gb.lesson_6.money;


import java.math.BigDecimal;

public class Money {

    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money other) {
        if (other.currency != this.currency) {
            throw new IllegalArgumentException();
        }
        return new Money(this.amount.add(other.amount), currency);
    }

    public static void main(String[] args) {
        Money money1 = new Money(BigDecimal.valueOf(0.1), Currency.RUB);
        Money money2 = new Money(BigDecimal.valueOf(0.2), Currency.RUB);
        System.out.println(money1.add(money2).amount);
    }


}
