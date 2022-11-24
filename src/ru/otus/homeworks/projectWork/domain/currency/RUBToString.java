package ru.otus.homeworks.projectWork.domain.currency;

import ru.otus.homeworks.projectWork.app.services.CurrencyToString;

public class RUBToString implements CurrencyToString {

    @Override
    public String toSting(int value) {
        if (value == 1)
            return "рубль";
        else if (value > 0 && value < 5)
            return "рубля";
        return "рублей";
    }

    @Override
    public int getGender() {
        return 0;
    }
}