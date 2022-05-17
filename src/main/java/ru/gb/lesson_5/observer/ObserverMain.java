package ru.gb.lesson_5.observer;

import java.util.stream.Stream;

public class ObserverMain {
    public static void main(String[] args) {

        Channel durovsChannel = new Channel("Durov's channel");
        Person ivan = new Person("Ivan");
        Bot bot = new Bot();
        durovsChannel.subscribe(ivan);
        durovsChannel.subscribe(bot);


        Channel solovyev = new Channel("Solovyev's channel");
        solovyev.subscribe(bot);


        durovsChannel.addNews("Vegetables is very nice food");

        solovyev.addNews("We need an imperator");

        //push
        //pull

    }
}
