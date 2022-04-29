package ru.gb.lesson_4.decorator;

public class TelegramNotifier implements Notifier {

    private final Notifier composite;

    public TelegramNotifier(Notifier composite) {
        this.composite = composite;
    }


    @Override
    public void send(String message) {
        System.out.println("telegram.send: " + message);
        composite.send(message);
    }
}
