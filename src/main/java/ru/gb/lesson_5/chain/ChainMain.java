package ru.gb.lesson_5.chain;

public class ChainMain {
    public static void main(String[] args) {
        Client client = Client.builder()
                .type(ClientType.INDIVIDUAL)
                .name("Sergey")
                .build();


        AllManager manager = new AllManager(new Person("Kostya"));
        IndividualCreditManager ivan = new IndividualCreditManager(new Person("Ivan"));
        IndividualMortgageManager sveta = new IndividualMortgageManager(new Person("Sveta"));
        BusinessCreditManager mariya = new BusinessCreditManager(new Person("Mariya"));
        manager.setNext(ivan);
        ivan.setNext(sveta);
        sveta.setNext(mariya);

        NotGoodManager notGoodManager = new NotGoodManager(new Person("Vladimir"));
        notGoodManager.setNext(manager);
        Worker chain = notGoodManager;


        chain.handle(client);

        /*IndividualCreditManager ivan = new IndividualCreditManager(new Person("Ivan"));
        IndividualMortgageManager sveta = new IndividualMortgageManager(new Person("Sveta"));
        BusinessCreditManager mariya = new BusinessCreditManager(new Person("Mariya"));

        ivan.handle(client);
        sveta.handle(client);*/
    }
}
