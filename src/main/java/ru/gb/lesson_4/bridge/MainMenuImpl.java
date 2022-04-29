package ru.gb.lesson_4.bridge;

import lombok.Builder;

@Builder
public class MainMenuImpl implements MainMenu {

    private final OSController controller;

    @Override
    public void powerOff() {
        controller.powerOff();
    }

    @Override
    public void volumeUp() {
        controller.volumeUp();
    }

    @Override
    public void volumeDown() {
        controller.volumeDown();
    }

    @Override
    public SystemInfo systemInfo() {
        return controller.systemInfo();
    }
}
