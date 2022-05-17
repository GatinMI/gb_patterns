package ru.gb.lesson_5.visitor;

public class Agent implements Visitor{
    private int money = 0;
    @Override
    public void visit(Bank bank) {
            bank.addMoney(money);
            System.out.println("I'm giving all money to bank");
    }

    @Override
    public void visit(House object) {
        money += 5;
        System.out.println("Give me your money!!!");
    }
}
