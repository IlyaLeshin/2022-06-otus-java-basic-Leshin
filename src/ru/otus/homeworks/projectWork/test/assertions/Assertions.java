package ru.otus.homeworks.projectWork.test.assertions;

public class Assertions {

    public static void assertStringEquals(String expected, String actual) {
        if (!(expected.equals(actual))) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", "Ожидаемое значение " + expected + " не соответствует", actual));
        }
    }
}