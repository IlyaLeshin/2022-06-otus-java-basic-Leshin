package ru.otus.homeworks.hw8.test.unitTests.mock;

import ru.otus.homeworks.hw8.game.GameWinnerConsolePrinter;
import ru.otus.homeworks.hw8.game.Player;

public class GameWinnerConsolePrinterMock extends GameWinnerConsolePrinter {

    private Player winner;
    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}