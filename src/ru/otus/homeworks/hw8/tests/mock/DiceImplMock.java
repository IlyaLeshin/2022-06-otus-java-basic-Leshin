package ru.otus.homeworks.hw8.tests.mock;

import ru.otus.homeworks.hw8.game.Dice;

import java.util.concurrent.atomic.AtomicInteger;

public class DiceImplMock implements Dice {
    private static final AtomicInteger DiceCounter = new AtomicInteger(1);

    @Override
    public int roll() {

        return DiceCounter.getAndIncrement();

    }
}
