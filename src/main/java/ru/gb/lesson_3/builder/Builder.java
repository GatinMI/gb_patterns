package ru.gb.lesson_3.builder;

public interface Builder {

    Builder body(String body);
    Builder sender(String sender);
    Builder to(String to);
    Builder subject(String subject);

    Message build();


}
