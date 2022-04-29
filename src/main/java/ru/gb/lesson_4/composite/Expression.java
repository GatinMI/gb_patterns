package ru.gb.lesson_4.composite;

public interface Expression {

    //(1 + 2 + 3) * (1 - 2) = ?

    double getResult();

    String description();

}
