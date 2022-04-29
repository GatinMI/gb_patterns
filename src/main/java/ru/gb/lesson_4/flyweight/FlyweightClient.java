package ru.gb.lesson_4.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlyweightClient {
    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        PaperSize paperSize = flyweightFactory.getPaperSize(5, 10);
        PaperSize paperSize1 = flyweightFactory.getPaperSize(5, 10);
        //System.out.println(paperSize == paperSize1);


        List<String> collect = getStream()
                .map(chars -> new String(chars).intern())
                .collect(Collectors.toList());
        //List<String> strings = Arrays.asList("hello!", "hello!");

    }


    private static Stream<char[]> getStream() {
        return Stream.of(
                new char[] {'h', 'e', 'l', 'l', 'o'},
                new char[] {'a', 'c', 'd'},
                new char[] {'h', 'e', 'l', 'l', 'o'},
                new char[] {'h', 'e', 'l', 'l', 'o'},
                new char[] {'h', 'e', 'l', 'l', 'o'},
                new char[] {'h', 'e', 'l', 'l', 'o'},
                new char[] {'h', 'e', 'l', 'l', 'o'},
                new char[] {'h', 'e', 'l', 'l', 'o'}

        );
    }
}
