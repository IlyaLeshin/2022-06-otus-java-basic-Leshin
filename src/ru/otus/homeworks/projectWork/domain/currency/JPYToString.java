package ru.otus.homeworks.projectWork.domain.currency;

import ru.otus.homeworks.projectWork.app.services.CurrencyToString;

public class JPYToString implements CurrencyToString {

      @Override
    public String toSting(int value) {
        if (value == 1)
            return "йена";
        else if (value > 0 && value < 5)
            return "йены";
        return "йен";
    }

    @Override
    public int getGender() {
        return 1;
    }
}