package ru.dk.abstractfactory.moneyfactory.impl.factories;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.Coin;
import ru.dk.abstractfactory.moneyfactory.abstr.products.PaperBill;
import ru.dk.abstractfactory.moneyfactory.impl.products.AmericanDollarCoin;
import ru.dk.abstractfactory.moneyfactory.impl.products.EuroCoin;
import ru.dk.abstractfactory.moneyfactory.impl.products.PaperEuro;
import ru.dk.abstractfactory.moneyfactory.impl.products.PaperUSDollar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SantaMonicaMoneyFactory implements AbstractMoneyFactory {

    @Override
    public List<PaperBill> printPaperMoney(int numberOfBills, int denominationOfTheBill, String type) {
        List<PaperBill> result = null;
        if (numberOfBills > 0 && denominationOfTheBill > 0){
            result = switch(type){
                case "USD" -> Stream
                        .generate(() -> new PaperUSDollar(denominationOfTheBill))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                case "EUR" -> Stream
                        .generate(() -> new PaperEuro(denominationOfTheBill))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                default -> throw new IllegalStateException("Unexpected value: " + type);
            };
        }
        return result;
    }

    @Override
    public List<Coin> coinage(int numberOfBills, int denominationOfTheBill, String type) {
        List<Coin> result = null;
        if (numberOfBills > 0 && denominationOfTheBill > 0){
            result = switch(type){
                case "USD" -> Stream
                        .generate(() -> new AmericanDollarCoin(denominationOfTheBill))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                case "EUR" -> Stream
                        .generate(() -> new EuroCoin(denominationOfTheBill))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                default -> throw new IllegalStateException("Unexpected value: " + type);
            };
        }
        return result;
    }
}
