package ru.gb.lesson_4.decorator;

public class BaseNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
