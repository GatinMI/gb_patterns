package ru.gb.lesson_5.command;

import java.util.ArrayDeque;
import java.util.Queue;

public class CommandMain {
    public static void main(String[] args) {

        CopyCommand copyCommand = new CopyCommand();

        Button copy = new Button("copy", "copy.png", 10, 10,
                copyCommand);
        //copy.press();

        Button copyAnotherMenu = new Button("copy in another menu", "copy_1.png", 10,
                10, copyCommand);
        //copy.press();



        StringBuilder textEditor = new StringBuilder("First txt");
        PasteCommand pasteCommand = new PasteCommand("'text to paste'", textEditor);


        Button textPaster = new Button("text paster", "textPaster", 10,
                10, pasteCommand);
        ArrayDeque<Command> history = new ArrayDeque<>();
        pasteCommand.setHistorySaver(history);

        System.out.println(textEditor);
        textPaster.press();

        System.out.println(textEditor);

        UndoCommand undoCommand = new UndoCommand();
        undoCommand.setHistorySaver(history);
        Button undo = new Button("undo", "undo.png", 10, 10, undoCommand);
        undo.press();
    }
}
