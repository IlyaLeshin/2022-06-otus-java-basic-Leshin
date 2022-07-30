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

        int numberCorrectAnswerForQuestionOne = 5;
        int numberCorrectAnswerForQuestionTwo = 2;
        int numberCorrectAnswerForQuestionThree = 1;

        Object[][][] questionsAndAnswerOptionsAndCorrectAnswers = {
                {
                        {questionOne},
                        {answerFirstOptionForQuestionOne, answerSecondOptionForQuestionOne, answerThirdOptionForQuestionOne, answerFourthOptionForQuestionOne, answerFifthOptionForQuestionOne},
                        {numberCorrectAnswerForQuestionOne}
                },
                {
                        {questionTwo},
                        {answerFirstOptionForQuestionTwo, answerSecondOptionForQuestionTwo, answerThirdOptionForQuestionTwo},
                        {numberCorrectAnswerForQuestionTwo}
                },
                {
                        {questionThree},
                        {answerFirstOptionForQuestionThree, answerSecondOptionForQuestionThree, answerThirdOptionForQuestionThree, answerFourthOptionForQuestionThree},
                        {numberCorrectAnswerForQuestionThree}
                }
        };

        for (int i = 0; i < questionsAndAnswerOptionsAndCorrectAnswers.length; i++) {
            Object question = questionsAndAnswerOptionsAndCorrectAnswers[i][0][0];
            System.out.println("(" + (i + 1) + ")" + question);

            for (int j = 0; j < questionsAndAnswerOptionsAndCorrectAnswers[i][1].length; j++) {
                System.out.println((j + 1) + ".вариант:	" + questionsAndAnswerOptionsAndCorrectAnswers[i][1][j]);
            }
            System.out.print("Ваш ответ: №");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                int answerOption = scanner.nextInt();

                if (answerOption <= (questionsAndAnswerOptionsAndCorrectAnswers[i][1].length) && answerOption > 0) {

                    int numberCorrectAnswer = (Integer) questionsAndAnswerOptionsAndCorrectAnswers[i][2][0];

                    if (answerOption == numberCorrectAnswer){
                        System.out.println("Великолепно! Это правильный ответ");
                        correctCount++;
                    } else{
                        System.out.println("Неверно! Правильный ответ: " + numberCorrectAnswer);
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