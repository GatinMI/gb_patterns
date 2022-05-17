package ru.gb.lesson_5.template_method;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.live();
        Animal dog = new Dog();
        dog.live();

    }
}
