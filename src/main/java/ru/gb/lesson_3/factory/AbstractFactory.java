package ru.gb.lesson_3.factory;

public interface AbstractFactory {

    Chair createChair();
    Table createTable();
    default Comod createComod(){
        return new Comod() {
        };
    }
}
