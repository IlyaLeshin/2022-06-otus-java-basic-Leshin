package ru.otus.homeworks.projectWork.domain.currency;

import ru.otus.homeworks.projectWork.app.services.CurrencyToString;

public class CurrencySelect {

    public static CurrencyToString SelectCurrencyToString(Currency currency) {
        return switch (currency) {
            case RUB -> new RUBToString();
            case USD -> new USDToString();
            case CNY -> new CNYToString();
            case JPY -> new JPYToString();
        };
    }
}