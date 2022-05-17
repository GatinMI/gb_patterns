package ru.gb.lesson_5.strategy;

public class Bank {
    private PaymentStrategy paymentStrategy;

    public void pay(int amount) {
        paymentStrategy.pay(amount);

    }

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
