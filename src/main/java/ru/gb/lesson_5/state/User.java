package ru.gb.lesson_5.state;

import lombok.Setter;

@Setter
public class User {

    private UserStatus status;


    public void write(String post) {
        status.write(post);
    }

    public String read() {
        return status.read();

    }

}
