package ru.gb.lesson_5.command;

public class CopyCommand extends AbstractCommand {
    @Override
    public void execute() {
        System.out.println("I'm copying");
        history.add(this);
    }
}
