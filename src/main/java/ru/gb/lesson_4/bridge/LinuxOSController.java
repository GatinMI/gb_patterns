package ru.gb.lesson_4.bridge;

public class LinuxOSController implements OSController {
    @Override
    public void powerOff() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public SystemInfo systemInfo() {
        return SystemInfo.builder()
                .systemType(SystemType.LINUX)
                .build();
    }
}
