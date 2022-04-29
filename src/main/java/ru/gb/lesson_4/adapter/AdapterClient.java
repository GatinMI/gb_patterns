package ru.gb.lesson_4.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterClient {
    public static void main(String[] args) {
        List<Roundable> roundables = new ArrayList<>();


        roundables.add(new Circle(3));
        Square square = new Square(4);
        roundables.add(new SquareRoundableAdapter(square));




    }
}
