package ru.gb.lesson_5.mediator;

import lombok.AllArgsConstructor;


public class Cleaner {

    private final Dispatcher dispatcher;

    public Cleaner(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
        dispatcher.addCleaner(this);
    }

    public void clean() {
        dispatcher.notifyAboutAction(this, "I want to clean");
    }

    public void getOut() {
        System.out.println("Getting out");
    }

}
