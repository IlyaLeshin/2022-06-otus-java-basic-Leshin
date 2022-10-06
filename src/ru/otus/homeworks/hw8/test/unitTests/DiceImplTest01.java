package ru.otus.homeworks.hw8.test.unitTests;

import ru.otus.homeworks.hw8.game.Dice;
import ru.otus.homeworks.hw8.game.DiceImpl;
import ru.otus.homeworks.hw8.test.assertions.Assertions;

public class DiceImplTest01 {
    public static void InRange() {
        String scenario = "DiceImplTest01.InRange Тест проврки максимального значения граней кубика";
        try {
            Dice actual = new DiceImpl();
            for (int i = 1; i < 10; i++) {
                Assertions.assertInRange(6, actual.roll());
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}