package ru.gb.lesson_5.chain;

public class BusinessCreditManager extends AbstractWorker {
    public BusinessCreditManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if (client.getType() == ClientType.BUSINESS) {
            System.out.printf("I'm %s, give credit to %s", person.getUsername(), client.getName());
        }
        super.handle(client);
    }
}
