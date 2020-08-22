package ru.dk.observer;

import ru.dk.observer.impl.marines.Marine;
import ru.dk.observer.impl.marines.PlatoonСommander;

public class MarinesPlatoon {

    public static void main(String[] args) {
        PlatoonСommander platoonСommander = new PlatoonСommander();
        for (int i = 0; i < 5; i++) {
            platoonСommander.addUnit(new Marine(platoonСommander));
        }
        platoonСommander.order("run");
        platoonСommander.order("fire");
        platoonСommander.order("mask");
    }

}
