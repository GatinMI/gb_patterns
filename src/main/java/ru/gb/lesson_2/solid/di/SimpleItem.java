package ru.gb.lesson_2.solid.di;

public class SimpleItem implements Item{
    private int price;

    @Override
    public int getPrice() {
        return price;
    }
}
