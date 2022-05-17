package ru.gb.lesson_5.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        //Phanatik phanatik = new Phanatik();
        Bank bank = new Bank();
        House house = new House();
        House house1 = new House();
        //house.visit(phanatik);
        Agent smith = new Agent();
        house.visit(smith);
        house1.visit(smith);
        bank.visit(smith);
        System.out.println(bank.getMoney());
        bank.visit(new Person());
    }
}
