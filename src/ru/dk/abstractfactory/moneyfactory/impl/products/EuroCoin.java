package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;

public class EuroCoin implements Coin {

    private final int denominationOfTheBill;
    private final AbstractMoneyFactory manufacturer;

    public EuroCoin(int denominationOfTheBill, AbstractMoneyFactory manufacturer) {
        this.denominationOfTheBill = denominationOfTheBill;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "EuroCoin{" +
                "denominationOfTheBill=" + denominationOfTheBill +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
