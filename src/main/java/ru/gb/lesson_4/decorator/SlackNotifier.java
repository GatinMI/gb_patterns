package ru.gb.lesson_4.decorator;

public class SlackNotifier implements Notifier {


    private final Notifier notifier;

    public SlackNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        System.out.println("slack.send: " + message);
        notifier.send(message);
    }
}
