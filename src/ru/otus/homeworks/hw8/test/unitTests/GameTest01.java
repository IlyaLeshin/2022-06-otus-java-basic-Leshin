package ru.otus.homeworks.hw8.test.unitTests;

import ru.otus.homeworks.hw8.game.Dice;
import ru.otus.homeworks.hw8.game.Game;
import ru.otus.homeworks.hw8.game.Player;
import ru.otus.homeworks.hw8.test.assertions.Assertions;
import ru.otus.homeworks.hw8.test.unitTests.mock.DiceImplMock;
import ru.otus.homeworks.hw8.test.unitTests.mock.GameWinnerConsolePrinterMock;
import ru.otus.homeworks.hw8.test.unitTests.mock.PlayerMock;

public class GameTest01 {

    public static void rightChooseWinner() {
        String scenario = "GameTest01.playGame Тест проверки вычесления победителя (победитель player2)";
        try {
            Dice dice = new DiceImplMock();
            GameWinnerConsolePrinterMock winnerPrinter = new GameWinnerConsolePrinterMock();
            Game game = new Game(dice, winnerPrinter);
            Player playerOne = new PlayerMock("player1");
            Player playerTwo = new PlayerMock("player2");
            game.playGame(playerOne, playerTwo);
            Assertions.assertRightChooseWinner(playerTwo,winnerPrinter.getWinner());

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}