package ru.gb.lesson_5.command;

import java.util.Queue;

public interface Command {

    void setHistorySaver(Queue<Command> commands);

    void execute();
}
