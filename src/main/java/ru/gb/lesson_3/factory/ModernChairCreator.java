package ru.gb.lesson_3.factory;

public class ModernChairCreator implements ChairCreator {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
