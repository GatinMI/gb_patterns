package ru.gb.lesson_4.proxy;

public class Money {
    private final double rub;

    public Money(double rub) {
        this.rub = rub;
    }

    @Override
    public String toString() {
        return String.valueOf(rub);
    }
}
