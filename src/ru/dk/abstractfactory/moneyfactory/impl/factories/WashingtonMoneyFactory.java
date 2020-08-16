package ru.dk.abstractfactory.moneyfactory.impl.factories;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;
import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;
import ru.dk.abstractfactory.moneyfactory.impl.products.EuroCoin;
import ru.dk.abstractfactory.moneyfactory.impl.products.PaperEuro;
import java.util.ArrayList;
import java.util.List;

public class EuroFactory implements AbstractMoneyFactory {

    @Override
    public List<PaperBill> printPaperMoney(int numberOfBills, int denominationOfTheBill) {
        ArrayList<PaperBill> result;
        if (numberOfBills > 0){
            result = new ArrayList();
            for (int i = 0; i < numberOfBills; i++) {
                result.add(new PaperEuro(denominationOfTheBill));
            }
        }else return null;
        return result;
    }

    @Override
    public List<Coin> coinage(int numberOfBills, int denominationOfTheBill) {
        ArrayList<Coin> result;
        if (numberOfBills > 0){
            result = new ArrayList();
            for (int i = 0; i < numberOfBills; i++) {
                result.add(new EuroCoin(denominationOfTheBill));
            }
        }else return null;
        return result;
    }
}
