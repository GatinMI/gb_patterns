package ru.gb.lesson_3.factory;

public class VintageChairCreator implements ChairCreator {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }
}
