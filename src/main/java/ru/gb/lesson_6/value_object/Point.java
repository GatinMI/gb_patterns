package ru.gb.lesson_6.value_object;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        String string1 = new String("string");
        String string2 = new String("string");
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        String string3 = "st";
        String string4 = "st";
        String string5 = new String("st").intern();
        System.out.println(string3 == string4);
        System.out.println(string3 == string5);
    }
}
