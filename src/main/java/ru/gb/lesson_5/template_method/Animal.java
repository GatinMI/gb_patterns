package ru.gb.lesson_5.template_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Animal {


    public final void live() {
        wakeUp();

        System.out.println("Soem step");
        log.info("log");
        eat();

        toilet();

        eat();

        makeSound();

        sleep();
    }

    protected abstract void sleep();

    protected abstract void makeSound();

    protected abstract void toilet();

    protected abstract void eat();

    protected abstract void wakeUp();
}
