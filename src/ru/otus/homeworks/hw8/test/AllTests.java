package ru.otus.homeworks.hw8.test;

import ru.otus.homeworks.hw8.test.unitTests.*;

public class AllTests {
    public static void main(String[] args) {

        DiceImplTest01.InRange();
        DiceImplTest02.NotNegative();
        GameTest01.rightChooseWinner();
        GameTest02.noWinner();
    }
}