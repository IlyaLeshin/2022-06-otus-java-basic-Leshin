package ru.otus.homeworks.hw8.test.unitTests.mock;

import ru.otus.homeworks.hw8.game.Player;

public class PlayerMock extends Player {

    public PlayerMock(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}