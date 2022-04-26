package ru.gb.lesson_3.factory;

public class MainAbstractFactory {

    public static void main(String[] args) {
        AbstractFactory factory;
        if (args[0].equals("vintage")) {
            factory = new VintageFactory();
        } else if (args[0].equals("modern")){
            factory = new ModernFactory();
        } else if (args[0].equals("loft")) {
            factory = new LoftFactory();
        } else {
            throw new IllegalArgumentException();
        }

        //-------------

        Chair chair = factory.createChair();
        Chair chair1 = factory.createChair();
        Table table = factory.createTable();
    }
}
