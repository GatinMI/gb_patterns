package ru.gb.lesson_4.composite;

public class CompositeClient {
    public static void main(String[] args) {

        Expression expression = new Multiply(
                new Value(1.4),
                new Value(5)
        );
        System.out.println(expression.description());
        System.out.println(expression.getResult());


        Expression expression2 = new Multiply(
                new Add(
                        new Value(1),
                        new Value(3.2)
                ),
                new Value(5)
        );
        System.out.println(expression2.description());
        System.out.println(expression2.getResult());
    }
}
