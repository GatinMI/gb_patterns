package ru.gb.lesson_5.chain;

public class IndividualMortgageManager extends AbstractWorker {
    public IndividualMortgageManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if (client.getType() == ClientType.INDIVIDUAL) {
            System.out.printf("I'm %s, give mortgage to %s\n", person.getUsername(), client.getName());

        }
        super.handle(client);
    }
}
