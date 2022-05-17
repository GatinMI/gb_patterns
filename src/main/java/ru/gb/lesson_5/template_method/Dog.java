package ru.gb.lesson_5.template_method;

public class Dog extends Animal {
    @Override
    protected void sleep() {
        System.out.println("Lay to legs of human");
    }

    @Override
    protected void makeSound() {
        System.out.println("WHoof");
    }

    @Override
    protected void toilet() {
        System.out.println("Human, I need to go to street!!!!");
    }

    @Override
    protected void eat() {
        System.out.println("OM NOM NOM");
    }

    @Override
    protected void wakeUp() {
        System.out.println("lick face of human");
    }
}
