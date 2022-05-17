package ru.gb.lesson_5.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Button {
    private final String name;
    private final String imgUrl;
    private final int width;
    private final int height;

    private Command command;

    public void press() {
        command.execute();
    }
}
