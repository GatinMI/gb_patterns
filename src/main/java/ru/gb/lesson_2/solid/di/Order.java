package ru.gb.lesson_2.solid.di;

import java.util.Collection;

public class Order {

    Collection<Item> items;

    public void add(Item simpleItem) {

    }

    public int getPrice() {
        return items.stream()
                .mapToInt(Item::getPrice)
                .sum();
    }
}
