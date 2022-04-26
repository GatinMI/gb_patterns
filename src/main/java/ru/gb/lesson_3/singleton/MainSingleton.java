package ru.gb.lesson_3.singleton;

import java.sql.Connection;
import java.util.concurrent.Exchanger;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        StaticSingletonNotLazy instance1 = StaticSingletonNotLazy.INSTANCE;


        Connection conntection = EnumSingleton.INSTANCE.getConntection();

        SynchronizedAccessorSingleton instance2 = SynchronizedAccessorSingleton.getInstance();


    }
}
