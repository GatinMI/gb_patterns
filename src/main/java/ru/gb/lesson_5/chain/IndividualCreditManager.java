package ru.gb.lesson_5.chain;

import lombok.AllArgsConstructor;
import lombok.Builder;


public class IndividualCreditManager extends AbstractWorker {


    public IndividualCreditManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if (client.getType() == ClientType.INDIVIDUAL) {
            System.out.printf("I'm %s, give credit to %s\n", person.getUsername(), client.getName());

        }
        super.handle(client);
    }
}
