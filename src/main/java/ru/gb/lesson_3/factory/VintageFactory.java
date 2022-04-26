package ru.gb.lesson_3.factory;


public class VintageFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Table createTable() {
        return new VintageTable();
    }

    @Override
    public Comod createComod() {
        return null;
    }
}
