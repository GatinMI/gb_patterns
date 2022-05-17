package ru.gb.lesson_5.chain;

import lombok.AllArgsConstructor;

public abstract class AbstractWorker implements Worker {
    protected final Person person;
    private Worker next;

    public AbstractWorker(Person person) {
        this.person = person;
    }

    @Override
    public void handle(Client client) {
        if (next != null) {
            next.handle(client);
        }
    }

    @Override
    public void setNext(Worker worker) {
        next = worker;
    }
}
