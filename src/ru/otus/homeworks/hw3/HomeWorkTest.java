package ru.otus.homeworks.hw3;

import java.util.Scanner;

public class HomeWorkTest {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String[] questions = {
                "Выберите номер варианта А1?",
                "Выберите номер варианта B2?",
                "Выберите номер варианта C2?",
                "Выберите номер варианта D3?"
        };

        String[][] answerOptions = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4"},
                {"D1", "D2", "D3", "D4"}
        };

        int[] correctAnswers = {0, 1, 1, 2};

        for (int i = 0; i < questions.length; i++) {
            System.out.println();
            System.out.println("(" + (i + 1) + ")" + questions[i]);
            System.out.println();

            for (int j = 0; j < answerOptions.length; j++) {
                System.out.println((j + 1) + ". Option: " + answerOptions[i][j]);
            }
            System.out.println();
            System.out.print("Ваш ответ: ");

            Scanner scanner = new Scanner(System.in);
            int answerOption = scanner.nextInt() - 1;

            if (answerOption == correctAnswers[i]) {
                System.out.println("Excellent! Right answer is: " + correctAnswers[i]);
                correctCount++;
            } else {
                System.out.println("Wrong! Right answer is: " + correctAnswers[i]);
                wrongCount++;
            }
            System.out.println();
            System.out.println("---------------------");
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
