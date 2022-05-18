package ru.gb.lesson_6.relation_object;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        UnitOfWork.newCurrent();
        Person.load(1L).ifPresent( person -> person.setJobId(2));
        Person person = Person.create("Anatoly", 2L);
        UnitOfWork.getCurrent().commit();
        UnitOfWork.setCurrent(null);

        
        
        UnitOfWork.newCurrent();
        Optional<Person> load = Person.loadByName(person.getName());
        if (load.isPresent()) {
            System.out.println("person created");
            load.get().remove();
        }
        UnitOfWork.getCurrent().commit();
        UnitOfWork.setCurrent(null);

        
        UnitOfWork.newCurrent();
        load = Person.load(load.get().getId());
        if (load.isEmpty()) {
            System.out.println("person deleted");
        }
        UnitOfWork.getCurrent().commit();
        UnitOfWork.setCurrent(null);

        UnitOfWork.newCurrent();
        load = Person.load(1L);
        System.out.println("Should be cached");
        Person.load(1L);
        UnitOfWork.getCurrent().commit();
        UnitOfWork.setCurrent(null);

    }
}
