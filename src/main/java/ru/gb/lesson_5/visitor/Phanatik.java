package ru.gb.lesson_5.visitor;

public class Phanatik implements Visitor {


    @Override
    public void visit(Bank object) {

    }

    @Override
    public void visit(House object) {
        System.out.println("Не хотите ли вы уверовать в нашего бога");
    }
}
