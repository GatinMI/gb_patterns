package ru.gb.lesson_5.state;

public class BannedStatus implements UserStatus {
    @Override
    public void write(String post) {

    }

    @Override
    public String read() {
        return null;
    }
}
