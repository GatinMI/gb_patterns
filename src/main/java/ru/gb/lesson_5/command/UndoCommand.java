package ru.gb.lesson_5.command;

public class UndoCommand extends AbstractCommand {
    @Override
    public void execute() {
        Command poll = history.poll();
        if (poll != null) {
            undo(poll);
        }
    }
    private void undo(Command command) {
        System.out.println("I'm undying " + command.getClass());
    }
}
