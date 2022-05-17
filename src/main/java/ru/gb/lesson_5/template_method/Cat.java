package ru.gb.lesson_5.template_method;

public class Cat extends Animal {
    @Override
    protected void sleep() {
        System.out.println("mur mur");
    }

    @Override
    protected void makeSound() {
        System.out.println("Mau");
    }

    @Override
    protected void toilet() {
        System.out.println("scrab scrab");
    }

    @Override
    protected void eat() {
        System.out.println("Look at human with hate look");
    }

    @Override
    protected void wakeUp() {
        System.out.println("Beat human to face");
    }
}
