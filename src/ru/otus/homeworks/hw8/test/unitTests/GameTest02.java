package ru.otus.homeworks.hw8.test.unitTests;

import ru.otus.homeworks.hw8.game.Dice;
import ru.otus.homeworks.hw8.game.Game;
import ru.otus.homeworks.hw8.game.Player;
import ru.otus.homeworks.hw8.test.assertions.Assertions;
import ru.otus.homeworks.hw8.test.unitTests.mock.GameWinnerConsolePrinterMock;
import ru.otus.homeworks.hw8.test.unitTests.mock.PlayerMock;
import ru.otus.homeworks.hw8.test.unitTests.stub.DiceImplStub;

public class GameTest02 {
    public static void noWinner() {
        String scenario = "GameTest02.playGame Тест проверки если значения бросков равны (победителя нет)";
        try {
            Dice dice = new DiceImplStub();
            GameWinnerConsolePrinterMock winnerPrinter = new GameWinnerConsolePrinterMock();
            Game game = new Game(dice, winnerPrinter);
            Player playerOne = new PlayerMock("player1");
            Player playerTwo = new PlayerMock("player2");
            game.playGame(playerOne, playerTwo);

            Assertions.assertNoWinner(winnerPrinter.getWinner());

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}