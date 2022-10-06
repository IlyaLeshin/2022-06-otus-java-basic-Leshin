package ru.otus.homeworks.hw8.test.assertions;
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

        public static void assertRightChooseWinner(Player expected, Player actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Победитель " + expected, actual));
        }
    }

    public static void assertNoWinner(Player actual) {
        if (!(actual == null)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Значение null - нет победителя", actual));
        }
    }

    public static void assertThrows(Class<? extends Throwable> expected, Runnable code) {
        Throwable actual = null;
        try {
            code.run();
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            throw new AssertionError("Given code does not throw any exception");
        }

        if (!actual.getClass().equals(expected)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected.getSimpleName(), actual.getClass().getSimpleName()));
        }
    }
}