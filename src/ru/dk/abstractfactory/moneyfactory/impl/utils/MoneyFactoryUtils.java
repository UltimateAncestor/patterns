package ru.dk.abstractfactory.moneyfactory.impl.utils;

import ru.dk.abstractfactory.moneyfactory.abstr.factories.AbstractMoneyFactory;
import ru.dk.abstractfactory.moneyfactory.abstr.products.Money;
import ru.dk.abstractfactory.moneyfactory.impl.products.AmericanDollarCoin;
import ru.dk.abstractfactory.moneyfactory.impl.products.EuroCoin;
import ru.dk.abstractfactory.moneyfactory.impl.products.PaperEuro;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoneyFactoryUtils {

    private static List<Money> result = null;

    public static List<Money> preProductionCoinControl(int numberOfBills,
                                                       int denominationOfTheBill,
                                                       String type,
                                                       AbstractMoneyFactory fromFactory){
        List<Money> result = null;
        if (numberOfBills > 0 && denominationOfTheBill > 0){
            result = switch(type){
                case "USD" -> Stream
                        .generate(() -> new AmericanDollarCoin(denominationOfTheBill, fromFactory))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                case "EUR" -> Stream
                        .generate(() -> new EuroCoin(denominationOfTheBill, fromFactory))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                default -> throw new IllegalStateException("Unexpected value: " + type);
            };
        }
        return result;
    }

    public static List<Money> preProductionPaperBillControl(int numberOfBills,
                                                       int denominationOfTheBill,
                                                       String type,
                                                       AbstractMoneyFactory fromFactory){
        List<Money> result = null;
        if (numberOfBills > 0 && denominationOfTheBill > 0){
            result = switch(type){
                case "USD" -> Stream
                        .generate(() -> new PaperEuro(denominationOfTheBill, fromFactory))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                case "EUR" -> Stream
                        .generate(() -> new EuroCoin(denominationOfTheBill, fromFactory))
                        .limit(numberOfBills)
                        .collect(Collectors.toList());
                default -> throw new IllegalStateException("Unexpected value: " + type);
            };
        }
        return result;
    }
}
