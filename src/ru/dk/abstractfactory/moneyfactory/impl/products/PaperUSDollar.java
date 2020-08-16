package ru.dk.abstractfactory.moneyfactory.impl.products;

import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;

public class PaperUSDollar implements PaperBill{

    private final int denominationOfTheBill;

    public PaperUSDollar(int denominationOfTheBill) {
        this.denominationOfTheBill = denominationOfTheBill;
    }

    @Override
    public String toString() {
        return "PaperUSDollar {" +
                "denominationOfTheBill = " + denominationOfTheBill +
                '}';
    }
}
