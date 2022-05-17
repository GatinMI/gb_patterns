package ru.gb.lesson_5.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CardStrategy implements PaymentStrategy {

    private final String number;

    @Override
    public void pay(int money) {
        System.out.println("Paid by card! " + money);
    }
}
