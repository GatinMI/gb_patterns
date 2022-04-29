package ru.gb.lesson_4.bridge;

import lombok.Builder;

@Builder
public class SecondaryMenuImpl implements SecondaryMenu {

    private final OSController controller;

    @Override
    public void volumeUp() {
        controller.volumeUp();
    }

    @Override
    public void volumeDown() {
        controller.volumeDown();
    }
}
