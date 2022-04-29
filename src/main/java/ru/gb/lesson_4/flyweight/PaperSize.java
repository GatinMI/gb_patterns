package ru.gb.lesson_4.flyweight;

import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder
@EqualsAndHashCode
public class PaperSize {

    private final double width;
    private final double height;


}
