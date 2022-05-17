package ru.gb.lesson_5.visitor;

import lombok.Getter;

@Getter
public class Bank {
    private int money = 0;

    public void visit(Visitor visitor) {
        visitor.visit(this);
    }

    public void addMoney(int money) {
        this.money += money;
    }
}
