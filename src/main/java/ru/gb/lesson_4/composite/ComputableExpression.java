package ru.gb.lesson_4.composite;

public interface ComputableExpression extends Expression{


    default String wrap(Expression expression) {
        if (expression instanceof ComputableExpression) {
            return "(" + expression.description() + ")";
        } else {
            return expression.description();
        }
    }
}
