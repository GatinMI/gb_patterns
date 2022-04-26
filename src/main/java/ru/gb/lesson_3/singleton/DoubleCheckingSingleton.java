package ru.gb.lesson_3.singleton;

public class DoubleCheckingSingleton {

    private static volatile DoubleCheckingSingleton instance;


    public static DoubleCheckingSingleton getInstance() {
        //JSR 133 - java memory model;
        DoubleCheckingSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckingSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = new DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }

    private DoubleCheckingSingleton() {
    }
}
