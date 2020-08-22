package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;

public class PaperUSDollar implements PaperBill{

    private final int denominationOfTheBill;
    private final AbstractMoneyFactory manufacturer;

    public PaperUSDollar(int denominationOfTheBill, AbstractMoneyFactory manufacturer) {
        this.denominationOfTheBill = denominationOfTheBill;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "PaperUSDollar{" +
                "denominationOfTheBill=" + denominationOfTheBill +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
