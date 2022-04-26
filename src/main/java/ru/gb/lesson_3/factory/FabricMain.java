package ru.gb.lesson_3.factory;

import org.springframework.boot.system.SystemProperties;

public class FabricMain {

    private final ChairCreator chairCreator;

    public FabricMain(ChairCreator chairCreator) {
        this.chairCreator = chairCreator;
    }


    void bussinessLogic() {
        Chair chair = chairCreator.createChair();
        System.out.println(chair);
    }






    public static void main(String[] args) {
        ChairCreator chairCreator;

        if (SystemProperties.get("chair.type").equals("vintage")) {
            chairCreator = new VintageChairCreator();
        } else {
            chairCreator = new ModernChairCreator();
        }


        new FabricMain(chairCreator).bussinessLogic();


    }
}
