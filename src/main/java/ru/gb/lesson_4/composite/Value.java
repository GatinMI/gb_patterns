package ru.gb.lesson_4.composite;

public class Value implements Expression {
    //5.5
    private final double value;

    public Value(double value) {

        this.value = value;
    }

    @Override
    public double getResult() {
        return value;
    }

    @Override
    public String description() {
        return String.valueOf(value);
    }
}
