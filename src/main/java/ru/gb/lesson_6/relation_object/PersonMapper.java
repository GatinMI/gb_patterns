package ru.gb.lesson_6.relation_object;

import java.util.Optional;

public interface PersonMapper extends Mapper<Person, Long> {

    Optional<Person> findByName(String name);
}
