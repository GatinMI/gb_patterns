package ru.gb.lesson_5.mediator;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private List<Cleaner> cleaners = new ArrayList<>();
    private final SeatRoad seatRoad = new SeatRoad();

    public void notifyAboutAction(Object object,  String info) {
        if (object instanceof Plane) {
            Plane plane = (Plane) object;

            if (info.equals("I want to seat")) {
                if (!seatRoad.isBusy()) {
                    System.out.println("Plane is sitting " + plane.getName());
                    cleaners.forEach(Cleaner::getOut);
                    seatRoad.setBusy(true);
                } else {
                    throw new IllegalArgumentException("You can't seat");
                }
            } else if (info.equals("I have seat!")){
                seatRoad.setBusy(false);
            }
        } else if (object instanceof Cleaner){
            if (seatRoad.isBusy()) {
                throw new IllegalArgumentException("You can't clean");
            }
        }
    }

    public void addCleaner(Cleaner cleaner) {
        cleaners.add(cleaner);
    }

}
