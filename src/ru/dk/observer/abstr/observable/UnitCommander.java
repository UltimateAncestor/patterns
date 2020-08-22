package ru.dk.observer.abstr.observable;

import ru.dk.observer.abstr.observer.Unit;

public interface UnitCommander {
    void addUnit(Unit unit);
    void removeUnit(Unit unit);
    void order(String command);
}
