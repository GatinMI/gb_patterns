package ru.gb.lesson_4.composite;

public class Add implements ComputableExpression {


    private final Expression left;
    private final Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double getResult() {
        return left.getResult() + right.getResult();
    }

    @Override
    public String description() {
        return wrap(left)  + "+" + wrap(right);
    }
}
