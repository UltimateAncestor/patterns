package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;

public class PaperEuro implements PaperBill {

    private final int denominationOfTheBill;

    public PaperEuro(int denominationOfTheBill) {
        this.denominationOfTheBill = denominationOfTheBill;
    }

    @Override
    public String toString() {
        return "PaperEuro {" +
                "denominationOfTheBill = " + denominationOfTheBill +
                '}';
    }
}
