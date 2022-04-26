package ru.gb.lesson_2.inform_exp;

import ru.gb.lesson_2.solid.di.Item;

public class OrderItem {
    private int qt;
    private Item item;

    public int getPrice() {
        return qt * item.getPrice() ;
    }
}
