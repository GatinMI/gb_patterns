package ru.gb.lesson_5.chain;

public class AllManager extends AbstractWorker {
    public AllManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        System.out.printf("Hi, %s\n", client.getName());
        super.handle(client);
    }
}
