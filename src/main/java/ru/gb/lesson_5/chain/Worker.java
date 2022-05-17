package ru.gb.lesson_5.chain;



public interface Worker {

    void handle(Client client);

    void setNext(Worker worker);

}
