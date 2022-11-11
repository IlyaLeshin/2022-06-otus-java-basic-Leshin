package ru.otus.homeworks.projectWork.test.unitTests;

import ru.otus.homeworks.projectWork.domain.currency.Currency;
import ru.otus.homeworks.projectWork.domain.currency.CurrencySelect;
import ru.otus.homeworks.projectWork.test.assertions.Assertions;

public class Test02 {


        public static void testRUBToString() {
            String scenario = "Test02.USDToString Тест проверки правильности вывода наименования валюты";
            try {
                Assertions.assertStringEquals("рублей", CurrencySelect.SelectCurrencyToString(Currency.RUB).toSting(0));
                Assertions.assertStringEquals("рубль", CurrencySelect.SelectCurrencyToString(Currency.RUB).toSting(1));
                Assertions.assertStringEquals("рублей", CurrencySelect.SelectCurrencyToString(Currency.RUB).toSting(5));
                Assertions.assertStringEquals("рубля", CurrencySelect.SelectCurrencyToString(Currency.RUB).toSting(3));
                System.out.printf("\"%s\" passed %n", scenario);
            } catch (AssertionError e) {
                System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            }
        }

    public static void testUSDToString() {
        String scenario = "Test02.USDToString Тест проверки правильности вывода наименования валюты";
        try {
            Assertions.assertStringEquals("долларов", CurrencySelect.SelectCurrencyToString(Currency.USD).toSting(0));
            Assertions.assertStringEquals("доллар", CurrencySelect.SelectCurrencyToString(Currency.USD).toSting(1));
            Assertions.assertStringEquals("долларов", CurrencySelect.SelectCurrencyToString(Currency.USD).toSting(5));
            Assertions.assertStringEquals("доллара", CurrencySelect.SelectCurrencyToString(Currency.USD).toSting(3));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public static void testCNYToString() {
        String scenario = "Test02.CNYToString Тест проверки правильности вывода наименования валюты";
        try {
            Assertions.assertStringEquals("юаней", CurrencySelect.SelectCurrencyToString(Currency.CNY).toSting(0));
            Assertions.assertStringEquals("юань", CurrencySelect.SelectCurrencyToString(Currency.CNY).toSting(1));
            Assertions.assertStringEquals("юаней", CurrencySelect.SelectCurrencyToString(Currency.CNY).toSting(5));
            Assertions.assertStringEquals("юаня", CurrencySelect.SelectCurrencyToString(Currency.CNY).toSting(3));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public static void testJPYToString() {
        String scenario = "Test02.JPYToString Тест проверки правильности вывода наименования валюты";
        try {
            Assertions.assertStringEquals("йен", CurrencySelect.SelectCurrencyToString(Currency.JPY).toSting(0));
            Assertions.assertStringEquals("йена", CurrencySelect.SelectCurrencyToString(Currency.JPY).toSting(1));
            Assertions.assertStringEquals("йен", CurrencySelect.SelectCurrencyToString(Currency.JPY).toSting(5));
            Assertions.assertStringEquals("йены", CurrencySelect.SelectCurrencyToString(Currency.JPY).toSting(3));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
