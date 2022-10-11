package ru.otus.homeworks.hw8.test.unitTests;

import ru.otus.homeworks.hw8.game.Dice;
import ru.otus.homeworks.hw8.game.DiceImpl;
import ru.otus.homeworks.hw8.test.assertions.Assertions;

public class DiceImplTest02 {
    public static void notNegative() {
        String scenario = "DiceImplTest02.notNegative Тест провеки значения граней кубика больше нуля";
        try {
            Dice actual = new DiceImpl();
            for (int i = 1; i < 10; i++) {
                Assertions.assertNotNegative(actual.roll());
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}