package ru.gb.lesson_5.iterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2 ,3, 4);


        Iterator<Integer> iterator = Collections.<Integer>emptySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
