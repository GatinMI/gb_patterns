package ru.gb.lesson_5.visitor;

import ru.gb.lesson_5.observer.Observable;

public interface Visitor {

    void visit(Bank object);
    void visit(House object);

}
