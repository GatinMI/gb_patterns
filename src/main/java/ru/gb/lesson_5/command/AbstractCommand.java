package ru.gb.lesson_5.command;

import java.util.Queue;

public abstract class AbstractCommand implements Command {

    protected Queue<Command> history;

    @Override
    public void setHistorySaver(Queue<Command> commands) {
        history = commands;
    }
}
