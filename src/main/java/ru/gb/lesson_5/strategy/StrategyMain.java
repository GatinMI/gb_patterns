package ru.gb.lesson_5.strategy;

public class StrategyMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setStrategy(new CardStrategy("1234123412341234"));
        bank.pay(10);

        bank.setStrategy(new Paypal("klmfdslkf3n4jrnlnl43llk;l4m"));

        bank.pay(10);
    }
}
