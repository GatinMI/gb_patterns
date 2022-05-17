package ru.gb.lesson_5.mediator;

public class MediatorMain {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        Cleaner cleaner = new Cleaner(dispatcher);
        Cleaner cleaner1 = new Cleaner(dispatcher);

        Plane jet = new Plane("Jet", dispatcher);

        Plane aerobus = new Plane("aerobus", dispatcher);

        jet.seat();
        cleaner.clean();
        jet.haveSeat();

        aerobus.seat();


    }
}
