package ru.dk.abstractfactory.moneyfactory;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.impl.factories.WashingtonMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.impl.factories.SantaMonicaMoneyFactory;

public class PrintMoneyFactory {

    public static void main(String[] args) {

        //My factory for the production of American dollars
        AbstractMoneyFactory santaMonicaMoneyFactory = new SantaMonicaMoneyFactory();

        //Concrete factory 1 that produces the concrete product 1
        //Print 10,000 us dollars and 100 in coins
        santaMonicaMoneyFactory.printPaperMoney(100, 100, "USD");
        santaMonicaMoneyFactory.coinage(10, 10, "USD");

        //Concrete factory 1 that produces the concrete product 2
        //Print 10,000 euro and 100 in coins
        santaMonicaMoneyFactory.printPaperMoney(100, 100, "EUR");
        santaMonicaMoneyFactory.coinage(10, 10, "EUR");

        //My factory for the production of Euros
        AbstractMoneyFactory washingtonMoneyFactory = new WashingtonMoneyFactory();

        //Concrete factory 2 that produces the concrete product 1
        //Print 10,000 euros and 1000 in coins
        washingtonMoneyFactory.printPaperMoney(100, 100, "EUR");
        washingtonMoneyFactory.coinage(100, 10, "EUR");

        //Concrete factory 2 that produces the concrete product 2
        //Print 10,000 USD and 1000 in coins
        washingtonMoneyFactory.printPaperMoney(100, 100, "USD");
        washingtonMoneyFactory.coinage(100, 10, "USD");
    }
}
