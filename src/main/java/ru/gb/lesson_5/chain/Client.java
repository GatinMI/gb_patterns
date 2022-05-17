package ru.gb.lesson_5.chain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Client {
    private final ClientType type;
    private final String name;
}
