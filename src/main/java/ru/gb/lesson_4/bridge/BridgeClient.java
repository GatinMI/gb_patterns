package ru.gb.lesson_4.bridge;

public class BridgeClient {
    public static void main(String[] args) {

        SystemType type = SystemType.valueOf(args[0]);
        MainMenuImpl.MainMenuImplBuilder builder = MainMenuImpl.builder();

        switch (type) {
            case OS_X:
                builder.controller(new XOSController());

        }
        MainMenu mainMenu = builder.build();
    }
}
