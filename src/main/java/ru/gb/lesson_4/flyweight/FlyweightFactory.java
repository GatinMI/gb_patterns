package ru.gb.lesson_4.flyweight;

import java.util.*;

public class FlyweightFactory {

    private final Map<PaperSize, PaperSize> cache = new HashMap();

    public PaperSize getPaperSize(double width, double height){
        PaperSize build = PaperSize.builder()
                .height(height)
                .width(width)
                .build();
        if (cache.containsKey(build)) {
            return cache.get(build);
        } else {
            cache.put(build, build);
            return build;
        }
    }
}
