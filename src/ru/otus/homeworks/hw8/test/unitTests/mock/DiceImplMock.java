package ru.otus.homeworks.hw8.test.unitTests.mock;

import ru.otus.homeworks.hw8.game.Dice;

import java.util.concurrent.atomic.AtomicInteger;

public class DiceImplMock implements Dice {
    private static final AtomicInteger DICE_COUNTER = new AtomicInteger(1);

    @Override
    public int roll() {

        return DICE_COUNTER.getAndIncrement();

    }
}