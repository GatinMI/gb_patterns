package ru.gb.lesson_4.composite;

import java.util.List;

public class Multiply implements ComputableExpression {

    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double getResult() {
        return left.getResult() * right.getResult();
    }

    @Override
    public String description() {
        return wrap(left) + "*" + wrap(right);
    }
}
