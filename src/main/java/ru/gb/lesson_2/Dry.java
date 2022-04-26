package ru.gb.lesson_2.dry;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dry {


    public void method1() {
        int onlineUsers = 5;
        int offlineUsers = 6;

        log.info(String.format("online: %s, offline %s", onlineUsers, offlineUsers));
        makeAllOffline();

        //someLogic
    }



    public void method2() {
        int onlineUsers = computeOnline();
        int offlineUsers = computeOffline();

        log.info(String.format("online: %s, offline %s", onlineUsers, offlineUsers));
        makeAllOffline();

        //someLogic;
    }

    public void method3() {
        int onlineUsers = 11;
        int offlineUsers = 5;

        log.info(String.format("online: %s, offline %s", onlineUsers, offlineUsers));
        makeAllOffline();

        //someLogic;
    }

    private int computeOffline() {
        return 11;
    }

    private int computeOnline() {
        return 5;
    }
    private void makeAllOffline() {
    }

}
