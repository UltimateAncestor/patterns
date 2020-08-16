package ru.dk.abstractfactory.moneyfactory;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.impl.factories.EuroFactory;
import ru.dk.abstractfactory.moneyfactory.impl.factories.USMint;

public class PrintMoneyFactory {

    public static void main(String[] args) {

        //My factory for the production of American dollars
        AbstractMoneyFactory usMint = new USMint();

        //Print 10,000 us dollars and 100 in coins
        usMint.printPaperMoney(100, 100);
        usMint.coinage(10, 10);

        //My factory for the production of Euros
        AbstractMoneyFactory euroFactory = new EuroFactory();

        //Print 10,000 euros and 1000 in coins
        euroFactory.printPaperMoney(100, 100);
        euroFactory.coinage(100, 10);
    }
}
