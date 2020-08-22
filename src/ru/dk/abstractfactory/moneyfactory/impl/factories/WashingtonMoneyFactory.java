package ru.dk.abstractfactory.moneyfactory.impl.factories;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.Money;
import ru.dk.abstractfactory.moneyfactory.impl.utils.MoneyFactoryUtils;
import java.util.List;

public class WashingtonMoneyFactory implements AbstractMoneyFactory {

    @Override
    public List<Money> printPaperMoney(int numberOfBills, int denominationOfTheBill, String type) {
        return MoneyFactoryUtils
                .preProductionPaperBillControl(numberOfBills, denominationOfTheBill, type, this);
    }

    @Override
    public List<Money> coinage(int numberOfBills, int denominationOfTheBill, String type) {
        return MoneyFactoryUtils
                .preProductionCoinControl(numberOfBills, denominationOfTheBill, type, this);
    }

    @Override
    public String toString() {
        String factoryIdentificator = "WMF 0.2";
        return "WashingtonMoneyFactory{" +
                "factoryIdentificator='" + factoryIdentificator + '\'' +
                '}';
    }
}
