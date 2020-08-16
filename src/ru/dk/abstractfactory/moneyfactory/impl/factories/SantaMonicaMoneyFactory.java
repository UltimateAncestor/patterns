package ru.dk.abstractfactory.moneyfactory.impl.factories;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;
import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;
import ru.dk.abstractfactory.moneyfactory.impl.products.AmericanDollarCoin;
import ru.dk.abstractfactory.moneyfactory.impl.products.PaperUSDollar;
import java.util.ArrayList;
import java.util.List;

public class USMint implements AbstractMoneyFactory {

    @Override
    public List<PaperBill> printPaperMoney(int numberOfBills, int denominationOfTheBill) {
        ArrayList<PaperBill> result = null;
        if (numberOfBills > 0){
            result = new ArrayList();
            for (int i = 0; i < numberOfBills; i++) {
                result.add(new PaperUSDollar(denominationOfTheBill));
            }
        }
        return result;
    }

    @Override
    public List<Coin> coinage(int numberOfBills, int denominationOfTheBill) {
        ArrayList<Coin> result = null;
        if (numberOfBills > 0){
            result = new ArrayList();
            for (int i = 0; i < numberOfBills; i++) {
                result.add(new AmericanDollarCoin(denominationOfTheBill));
            }
        }
        return result;
    }
}
