package ru.gb.lesson_5.visitor;

public class House {

    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
