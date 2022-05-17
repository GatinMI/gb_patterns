package ru.gb.lesson_5.visitor;

public class Policeman implements Visitor {

    @Override
    public void visit(Bank object) {
        System.out.println("I'm defending bank");    }

    @Override
    public void visit(House object) {
        System.out.println( "I'm checking house");
    }
}
