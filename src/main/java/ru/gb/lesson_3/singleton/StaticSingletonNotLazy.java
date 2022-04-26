package ru.gb.lesson_3.singleton;

public class StaticSingletonNotLazy {

    public static final StaticSingletonNotLazy INSTANCE =
            new StaticSingletonNotLazy();
}
