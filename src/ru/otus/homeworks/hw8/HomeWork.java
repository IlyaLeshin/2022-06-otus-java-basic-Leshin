package ru.otus.homeworks.hw8;

import ru.otus.homeworks.hw8.tests.DiceImplTest01;
import ru.otus.homeworks.hw8.tests.DiceImplTest02;
import ru.otus.homeworks.hw8.tests.GameTest01;
import ru.otus.homeworks.hw8.tests.GameTest02;


public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {

        DiceImplTest01.InRange();
        DiceImplTest02.NotNegative();

        // TODO: 22.09.2022
        GameTest01.rightChooseWinner();
        GameTest02.noWinner();
    }
}