package ru.gb.lesson_5.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Paypal implements PaymentStrategy {

    private final String token;

    @Override
    public void pay(int money) {
        System.out.println("Paid by paypal! " + money);
    }
}
