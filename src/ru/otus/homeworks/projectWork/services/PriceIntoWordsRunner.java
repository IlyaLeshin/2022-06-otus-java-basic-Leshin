package ru.otus.homeworks.projectWork.services;

import ru.otus.homeworks.projectWork.app.services.IOService;
import ru.otus.homeworks.projectWork.domain.currency.*;

import java.util.InputMismatchException;

import static ru.otus.homeworks.projectWork.domain.currency.Currency.*;


public class PriceIntoWordsRunner {
    private final IOService ioService;

    public PriceIntoWordsRunner(IOService ioService) {
        this.ioService = ioService;
    }

    public void runConvertNumberLessThanOneThousand() {


        while (true) {
            int price = 0;
            int currencyOption = 1;
            Currency currency = RUB;
            boolean tempBoolean = true;

            do {
                try {

                    ioService.outputString("Выберете валюту: \n" +
                            "[1] - RUB \n" +
                            "[2] - USD \n" +
                            "[3] - CNY \n" +
                            "[4] - JPY");
                    currencyOption = ioService.readInteger();
                    ioService.outputString("Введите цену от 0 до 999 цифрами для перевода в текст");
                    price = ioService.readInteger();
                    tempBoolean = false;
                } catch (InputMismatchException e) {
                    ioService.outputString("(InputMismatchException)Вы ошиблись при вводе, нужно вводить цифры");
                    ioService.readString();
                }

            } while (tempBoolean);
            if (currencyOption < 5 && currencyOption > 0 && price < 1000 && price > 0) {
                switch (currencyOption) {
                    case 1 -> currency = RUB;
                    case 2 -> currency = USD;
                    case 3 -> currency = CNY;
                    case 4 -> currency = JPY;
                }
                CurrencySelect.SelectCurrencyToString(currency);
                ioService.outputString("Цена " + price +" "+ currency + " пишется прописью как: " + PriceIntoWords.ConvertNumberLessThanOneThousand(price, currency));
                break;
            } else {
                ioService.outputString("Вы ошиблись при вводе попробуйте еще раз");
            }
        }
    }
}
