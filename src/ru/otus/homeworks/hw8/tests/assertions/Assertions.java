package ru.otus.homeworks.hw8.tests.assertions;

import ru.otus.homeworks.hw8.game.Game;
import ru.otus.homeworks.hw8.game.Player;

public class Assertions {

    public static void assertInRange(int range, int actual) {
        if (!(range > actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Значение не превышает количество граней кубика [" + range + "]", actual));
        }
    }

    public static void assertNotNegative(int actual) {
        if (!(0 < actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Значение > 0", actual));
        }
    }

    // TODO: 22.09.2022
    public static void assertNoWinner(Class<? extends Game> actual) {
        if (!(actual == null)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Значение null - нет победителя", actual));
        }
    }

    // TODO: 22.09.2022
    public static void assertRightChooseWinner(Player expected, Player actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Победитель " + expected, actual));
        }
    }

}
