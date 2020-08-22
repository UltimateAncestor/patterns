package ru.dk.observer.impl.marines;

import ru.dk.observer.abstr.observable.UnitCommander;
import ru.dk.observer.abstr.observer.Unit;

import java.util.ArrayList;

public class PlatoonСommander implements UnitCommander {

    private ArrayList<Unit> units = new ArrayList();

    @Override
    public void addUnit(Unit unit) {
        units.add(unit);
    }

    @Override
    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    @Override
    public void order(String command) {
        switch (command){
            case "fire" -> units.forEach(Unit::fire);
            case "run" -> units.forEach(Unit::run);
            case "mask" -> units.forEach(Unit::mask);
            default -> System.out.println("Command not found");
        }
    }
}
