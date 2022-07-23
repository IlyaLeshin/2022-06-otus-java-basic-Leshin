package ru.otus.homeworks.hw3;

import java.util.Scanner;

public class HomeWorkTest {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String questionOne = "Выберете правильный номер варианта ответа (А5Q1 is correct)";
        String questionTwo = "Выберете правильный номер варианта ответа (А2Q2 is correct) ?";
        String questionThree = "Выберете правильный номер варианта ответа (А1Q3 is correct) ?";

        String answerFirstOptionForQuestionOne = "А1Q1";
        String answerSecondOptionForQuestionOne = "А2Q1";
        String answerThirdOptionForQuestionOne = "А3Q1";
        String answerFourthOptionForQuestionOne = "А4Q1";
        String answerFifthOptionForQuestionOne = "А5Q1";

        String answerFirstOptionForQuestionTwo = "А1Q2";
        String answerSecondOptionForQuestionTwo = "А2Q2";
        String answerThirdOptionForQuestionTwo = "А3Q2";

        String answerFirstOptionForQuestionThree = "А1Q3";
        String answerSecondOptionForQuestionThree = "А2Q3";
        String answerThirdOptionForQuestionThree = "А3Q3";
        String answerFourthOptionForQuestionThree = "А4Q3";

        String correctAnswerForQuestionOne = answerFifthOptionForQuestionOne;
        String correctAnswerForQuestionTwo = answerSecondOptionForQuestionTwo;
        String correctAnswerForQuestionThree = answerFirstOptionForQuestionThree;

        String[][] questionsAndAnswerOptionsAndCorrectAnswers = {
                {questionOne, answerFirstOptionForQuestionOne, answerSecondOptionForQuestionOne, answerThirdOptionForQuestionOne, answerFourthOptionForQuestionOne, answerFifthOptionForQuestionOne, correctAnswerForQuestionOne},
                {questionTwo, answerFirstOptionForQuestionTwo, answerSecondOptionForQuestionTwo, answerThirdOptionForQuestionTwo, correctAnswerForQuestionTwo},
                {questionThree, answerFirstOptionForQuestionThree, answerSecondOptionForQuestionThree, answerThirdOptionForQuestionThree, answerFourthOptionForQuestionThree, correctAnswerForQuestionThree}
        };

        for (int i = 0; i < questionsAndAnswerOptionsAndCorrectAnswers.length; i++) {
            String question = questionsAndAnswerOptionsAndCorrectAnswers[i][0];
            System.out.println("(" + (i + 1) + ")" + question);

            for (int j = 1; j < questionsAndAnswerOptionsAndCorrectAnswers[i].length - 1; j++) {
                System.out.println(j + ".вариант:	" + questionsAndAnswerOptionsAndCorrectAnswers[i][j]);
            }
            System.out.print("Ваш ответ: №");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                int answerOption = scanner.nextInt();

                if (answerOption < (questionsAndAnswerOptionsAndCorrectAnswers[i].length - 1) && answerOption > 0) {

                    String correctAnswer = questionsAndAnswerOptionsAndCorrectAnswers[i][questionsAndAnswerOptionsAndCorrectAnswers[i].length - 1];

                    if (questionsAndAnswerOptionsAndCorrectAnswers[i][answerOption].equals(correctAnswer)) {
                        System.out.println("Великолепно! Это правильный ответ");
                        correctCount++;
                    } else {
                        System.out.println("Неверно! Правильный ответ: " + correctAnswer);
                        wrongCount++;
                    }
                    break;
                } else {
                    System.out.println("Вы ошиблись при вводе, попробуйте еще раз");
                    System.out.print("Ваш ответ: №");
                }
            }
            System.out.println("===	===	===	===	===");
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}