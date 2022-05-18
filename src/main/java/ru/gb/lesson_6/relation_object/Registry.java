package ru.gb.lesson_6.relation_object;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static Registry instance = new Registry();

    public static Registry getInstance() {
        return instance;
    }


    public static void reinit() {
        instance = new Registry();
    }


    Map<Class<? extends DomainObject<?>>, Mapper<? extends DomainObject<?>, ?>> map = new HashMap<>();

    {
        map.put(Person.class, new PersonMapperImpl());
    }

    public static <T extends DomainObject<ID>, ID> Mapper<T, ID> getMapper(Class<T> aClass) {
        return (Mapper<T, ID>) getInstance().map.get(aClass);
    }
}
