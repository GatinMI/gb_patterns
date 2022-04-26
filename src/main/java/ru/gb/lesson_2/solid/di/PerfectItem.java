package ru.gb.lesson_2.solid.di;

public class PerfectItem implements Item{
    private int price;
    private int quality;

    @Override
    public int getPrice() {
        return price;
    }
}
