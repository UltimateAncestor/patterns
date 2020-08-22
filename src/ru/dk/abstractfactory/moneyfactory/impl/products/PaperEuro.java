package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;

public class PaperEuro implements PaperBill {

    private final int denominationOfTheBill;
    private final AbstractMoneyFactory manufacturer;

    public PaperEuro(int denominationOfTheBill, AbstractMoneyFactory manufacturer) {
        this.denominationOfTheBill = denominationOfTheBill;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "PaperEuro{" +
                "denominationOfTheBill=" + denominationOfTheBill +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
