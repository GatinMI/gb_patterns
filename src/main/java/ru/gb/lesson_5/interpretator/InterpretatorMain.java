package ru.gb.lesson_5.interpretator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpretatorMain {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("^[a-z]+$");
        Matcher matcher = compile.matcher("afvsd");
        System.out.println(matcher.matches());
        System.out.println(compile.matcher("AV").matches());
        //spell expressions
    }
}
