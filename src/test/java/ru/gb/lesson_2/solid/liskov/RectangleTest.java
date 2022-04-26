package ru.gb.lesson_2.solid.liskov;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() throws IOException {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        assertEquals(20, rectangle.getArea());
    }
}