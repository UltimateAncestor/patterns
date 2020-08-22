package ru.dk.abstractfactory.moneyfactory.abstr.factories;

import ru.dk.abstractfactory.moneyfactory.abstr.products.Money;
import java.util.List;

/*
This micro project was written to study the generating design pattern "abstract factory".
Here are two workshops for the production of various money.
Paper money (dollars and euros) and coins (dollars and euros).
*/

public interface AbstractMoneyFactory {
    List<Money> printPaperMoney(int numberOfBills, int denominationOfTheBill, String type);
    List<Money> coinage(int numberOfBills, int denominationOfTheBill, String type);
}
