package ru.gb.lesson_2.dry;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private Integer id;
    private String password;
    private String username;
}
