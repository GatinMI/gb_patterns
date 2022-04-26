package ru.gb.lesson_3.builder;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode
public class User {
    private final Integer id;
    private final String username;
    private final String email;
    private final String password;
}
