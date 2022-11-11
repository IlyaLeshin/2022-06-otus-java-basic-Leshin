package ru.otus.homeworks.projectWork.services;

import ru.otus.homeworks.projectWork.domain.currency.Currency;
import ru.otus.homeworks.projectWork.domain.currency.CurrencySelect;

public class PriceIntoWords {

    public static String ConvertNumberLessThanOneThousand(int value, Currency currency) {

        if (currency == null) {
            throw new IllegalArgumentException("currency имеет значение null");
        }

        if (value < 0) {
            throw new IllegalArgumentException("value меньше нуля");
        }

        if (value >= 1000) {
            throw new IllegalArgumentException("value больше тысячи");
        }

        String[][] arrayNumbersFromZeroToNine = {
                {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
                {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"}
        };
        String[] arrayNumbersFromTenToNineteen = {"", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
        String[] arrayNumbersFromTwentyToNinety = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] arrayNumbersFromOneToNineHundred = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};


        int tempHundreds = value / 100;
        int tempTens = (value % 100) / 10;
        int tempOnes = value % 10;
        int tempBetweenTenAndTwenty = value-9;
        int tempGender = CurrencySelect.SelectCurrencyToString(currency).getGender();

        if (value == 0) {
            return "ноль" + " " + CurrencySelect.SelectCurrencyToString(currency).toSting(value);
        } else if (value < 10) {
            return arrayNumbersFromZeroToNine[tempGender][value]
                    + " " + CurrencySelect.SelectCurrencyToString(currency).toSting(value);
        } else if (value < 20) {
            return arrayNumbersFromTenToNineteen[tempBetweenTenAndTwenty]
                    + " " + CurrencySelect.SelectCurrencyToString(currency).toSting(value);
        } else if (value < 100) {
            return arrayNumbersFromTwentyToNinety[tempTens]
                    + ((tempOnes != 0) ? " " : "")
                    + arrayNumbersFromZeroToNine[tempGender][tempOnes]
                    + " " + CurrencySelect.SelectCurrencyToString(currency).toSting(tempOnes);
        } else {
            return arrayNumbersFromOneToNineHundred[tempHundreds]
                    + ((tempTens != 0) ? " " : "")
                    + arrayNumbersFromTwentyToNinety[tempTens]
                    + ((tempOnes != 0) ? " " : "")
                    + arrayNumbersFromZeroToNine[tempGender][tempOnes]
                    + " " + CurrencySelect.SelectCurrencyToString(currency).toSting(tempOnes);
        }
    }
}