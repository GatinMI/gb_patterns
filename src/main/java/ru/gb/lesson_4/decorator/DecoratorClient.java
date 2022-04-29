package ru.gb.lesson_4.decorator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorClient {



    public static void main(String[] args) throws FileNotFoundException {
        OutputStream output = getOutputStream("output");
    }

    private static OutputStream getOutputStream(String fileName) throws FileNotFoundException {
        return new FileOutputStream(fileName);
    }
}
