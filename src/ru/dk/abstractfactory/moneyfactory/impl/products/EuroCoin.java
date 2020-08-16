package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;

public class EuroCoin implements Coin {

    private final int denominationOfTheBill;

    public EuroCoin(int denominationOfTheBill) {
        this.denominationOfTheBill = denominationOfTheBill;
    }

    @Override
    public String toString() {
        return "EuroCoin {" +
                "denominationOfTheBill = " + denominationOfTheBill +
                '}';
    }
}
