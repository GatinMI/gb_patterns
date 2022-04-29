package ru.gb.lesson_4.adapter;

public class SquareRoundableAdapter implements Roundable{

    private final Square square;

    public SquareRoundableAdapter(Square square) {
        this.square = square;
    }


    @Override
    public double getRadius() {
        return square.getSide() * Math.sqrt(2) / 2;
    }
}
