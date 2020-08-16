package ru.dk.abstractfactory.moneyfactory.abstr.factories;

import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;
import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;
import java.util.List;

public interface AbstractMoneyFactory {

    List<PaperBill> printPaperMoney(int numberOfBills, int denominationOfTheBill, String type);

    List<Coin> coinage(int numberOfBills, int denominationOfTheBill, String type);
}
