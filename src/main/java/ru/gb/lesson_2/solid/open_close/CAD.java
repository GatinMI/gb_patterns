package ru.gb.lesson_2.solid.open_close;


import java.util.Arrays;
import java.util.Comparator;

public class CAD {

    public void drawAll(Shape[] shapes) {

        Arrays.sort(shapes.clone(), new Comparator<Shape>() {
            @Override
            public int compare(Shape shape, Shape t1) {
                return 0;
            }
        });

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                shape.draw();
            }

        }
    }
}
