package ru.otus.homeworks.projectWork.test.unitTests;

import ru.otus.homeworks.projectWork.domain.currency.Currency;
import ru.otus.homeworks.projectWork.services.PriceIntoWords;
import ru.otus.homeworks.projectWork.test.assertions.Assertions;

public class Test01 {
    public static void testRUB() {
        String scenario = "Test01.testRUB Тест проверки правильности вывода RUB";
        try {
            Assertions.assertStringEquals("ноль рублей", PriceIntoWords.ConvertNumberLessThanOneThousand(0, Currency.RUB));
            Assertions.assertStringEquals("десять рублей", PriceIntoWords.ConvertNumberLessThanOneThousand(10, Currency.RUB));
            Assertions.assertStringEquals("двадцать три рубля", PriceIntoWords.ConvertNumberLessThanOneThousand(23, Currency.RUB));
            Assertions.assertStringEquals("четыреста пятьдесят один рубль", PriceIntoWords.ConvertNumberLessThanOneThousand(451, Currency.RUB));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public static void testUSD() {
        String scenario = "Test01.testUSD Тест проверки правильности вывода USD";
        try {
            Assertions.assertStringEquals("ноль долларов", PriceIntoWords.ConvertNumberLessThanOneThousand(0, Currency.USD));
            Assertions.assertStringEquals("десять долларов", PriceIntoWords.ConvertNumberLessThanOneThousand(10, Currency.USD));
            Assertions.assertStringEquals("двадцать три доллара", PriceIntoWords.ConvertNumberLessThanOneThousand(23, Currency.USD));
            Assertions.assertStringEquals("четыреста пятьдесят один доллар", PriceIntoWords.ConvertNumberLessThanOneThousand(451, Currency.USD));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public static void testCNY() {
        String scenario = "Test01.testCNY Тест проверки правильности вывода CNY";
        try {
            Assertions.assertStringEquals("ноль юаней", PriceIntoWords.ConvertNumberLessThanOneThousand(0, Currency.CNY));
            Assertions.assertStringEquals("десять юаней", PriceIntoWords.ConvertNumberLessThanOneThousand(10, Currency.CNY));
            Assertions.assertStringEquals("двадцать три юаня", PriceIntoWords.ConvertNumberLessThanOneThousand(23, Currency.CNY));
            Assertions.assertStringEquals("четыреста пятьдесят один юань", PriceIntoWords.ConvertNumberLessThanOneThousand(451, Currency.CNY));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public static void testJPY() {
        String scenario = "Test01.testJPY Тест проверки правильности вывода JPY";
        try {
            Assertions.assertStringEquals("ноль йен", PriceIntoWords.ConvertNumberLessThanOneThousand(0, Currency.JPY));
            Assertions.assertStringEquals("десять йен", PriceIntoWords.ConvertNumberLessThanOneThousand(10, Currency.JPY));
            Assertions.assertStringEquals("двадцать три йены", PriceIntoWords.ConvertNumberLessThanOneThousand(23, Currency.JPY));
            Assertions.assertStringEquals("четыреста пятьдесят одна йена", PriceIntoWords.ConvertNumberLessThanOneThousand(451, Currency.JPY));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
