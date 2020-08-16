package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;

public class AmericanDollarCoin implements Coin {

    private final int denominationOfTheBill;

    public AmericanDollarCoin(int denominationOfTheBill) {
        this.denominationOfTheBill = denominationOfTheBill;
    }

    @Override
    public String toString() {
        return "AmericanDollarCoin {" +
                "denominationOfTheBill = " + denominationOfTheBill +
                '}';
    }
}
