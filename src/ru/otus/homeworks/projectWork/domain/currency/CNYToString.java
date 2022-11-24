package ru.otus.homeworks.projectWork.domain.currency;

import ru.otus.homeworks.projectWork.app.services.CurrencyToString;

public class CNYToString implements CurrencyToString {
    @Override
    public String toSting(int value) {
        if (value == 1)
            return "юань";
        else if (value > 0 && value < 5)
            return "юаня";
        return "юаней";
    }

    @Override
    public int getGender() {
        return 0;
    }
}