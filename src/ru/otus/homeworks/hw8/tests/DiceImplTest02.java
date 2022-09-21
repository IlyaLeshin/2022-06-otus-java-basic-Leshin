package ru.otus.homeworks.hw8.tests;

import ru.otus.homeworks.hw8.game.Dice;
import ru.otus.homeworks.hw8.game.DiceImpl;
import ru.otus.homeworks.hw8.tests.assertions.Assertions;

public class DiceImplTest02 {
    public static void NotNegative() {
        String scenario = "DiceImplTest02.NotNegative Тест провеки значения граней кубика больше нуля";
        try {
            Dice actual = new DiceImpl();
            Assertions.assertNotNegative(actual.roll());

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (
                Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}