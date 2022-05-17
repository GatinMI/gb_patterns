package ru.gb.lesson_5.command;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class PasteCommand extends AbstractCommand {



    private final String text;

    private final StringBuilder builder;


    @Override
    public void execute() {
        System.out.println("I'm pasting " + text);
        builder.append(text);
        history.add(this);
    }
}
