package ru.otus.homeworks.projectWork.domain.currency;

import ru.otus.homeworks.projectWork.app.services.CurrencyToString;

public class USDToString implements CurrencyToString {

    @Override
    public String toSting(int value) {
        if (value == 1)
            return "доллар";
        else if (value > 0 && value < 5)
            return "доллара";
        return "долларов";
    }

    @Override
    public int getGender() {
        return 0;
    }
}