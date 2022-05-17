package ru.gb.lesson_5.chain;

public class NotGoodManager extends AbstractWorker {
    public NotGoodManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if (Math.random() > 0.9) {
            System.out.printf("I do all needs for %s, i'm %s", client.getName(),
                    person.getUsername());
        } else {
            super.handle(client);
        }

    }
}
