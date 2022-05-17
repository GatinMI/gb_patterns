package ru.gb.lesson_5.observer;

public interface Subscriber {

    void inform(Observable observable, Object info);
}
