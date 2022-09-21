package ru.otus.homeworks.hw8.tests;

import ru.otus.homeworks.hw8.game.Dice;
import ru.otus.homeworks.hw8.game.Game;
import ru.otus.homeworks.hw8.game.GameWinnerConsolePrinter;
import ru.otus.homeworks.hw8.game.Player;
import ru.otus.homeworks.hw8.tests.mock.DiceImplMock;

public class GameTest01 {

    public static void rightChooseWinner() {
        String scenario = "GameTest01.playGame Тест проврки вычесления победителя (победитель player2)";
        try {
            Dice dice = new DiceImplMock();
            GameWinnerConsolePrinter winnerPrinter = new GameWinnerConsolePrinter();
            Game game = new Game(dice, winnerPrinter);
            Player playerOne = new Player("player1");
            Player playerTwo = new Player("player2");
            game.playGame(playerOne, playerTwo);
            // TODO: 22.09.2022

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}