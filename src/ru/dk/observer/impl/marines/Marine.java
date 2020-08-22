package ru.dk.observer.impl.marines;

import ru.dk.observer.abstr.observable.UnitCommander;
import ru.dk.observer.abstr.observer.Unit;

public class Marine implements Unit {

    private final UnitCommander unitCommander;

    public Marine(UnitCommander unitCommander) {
        this.unitCommander = unitCommander;
    }

    @Override
    public void fire() {
        System.out.println("Yes sir! Tra-ta-ta-ta-ta-ta!!!!");
    }

    @Override
    public void run() {
        System.out.println("Yes sir! I'm moving to a new position");
    }

    @Override
    public void mask() {
        System.out.println("Yes sir! I'm beginning to disguise myself");
    }

    public UnitCommander getUnitCommander() {
        return unitCommander;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
