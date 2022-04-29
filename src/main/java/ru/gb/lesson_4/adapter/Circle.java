package ru.gb.lesson_4.adapter;

public class Circle implements Roundable {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
