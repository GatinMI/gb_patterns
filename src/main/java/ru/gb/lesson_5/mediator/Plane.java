package ru.gb.lesson_5.mediator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Plane {
    private final String name;
    private final Dispatcher dispatcher;

    public void seat() {
        dispatcher.notifyAboutAction(this, "I want to seat");

    }
    public void haveSeat() {
        dispatcher.notifyAboutAction(this, "I have seat!");
    }
}
