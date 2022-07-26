package ru.otus.homeworks.hw3;

import java.util.Scanner;

public class HomeWorkTest {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String questionOne = "Выберете правильный номер варианта ответа (51 is correct)";
        String questionTwo = "Выберете правильный номер варианта ответа (22 is correct)";
        String questionThree = "Выберете правильный номер варианта ответа (13 is correct)";

        int answerFirstOptionForQuestionOne = 11;
        int answerSecondOptionForQuestionOne = 21;
        int answerThirdOptionForQuestionOne = 31;
        int answerFourthOptionForQuestionOne = 41;
        int answerFifthOptionForQuestionOne = 51;

        int answerFirstOptionForQuestionTwo = 12;
        int answerSecondOptionForQuestionTwo = 22;
        int answerThirdOptionForQuestionTwo = 32;

        int answerFirstOptionForQuestionThree = 13;
        int answerSecondOptionForQuestionThree = 23;
        int answerThirdOptionForQuestionThree = 33;
        int answerFourthOptionForQuestionThree = 43;

        int correctAnswerForQuestionOne = answerFifthOptionForQuestionOne;
        int correctAnswerForQuestionTwo = answerSecondOptionForQuestionTwo;
        int correctAnswerForQuestionThree = answerFirstOptionForQuestionThree;

        String[] questions = {questionOne};

        String[] newQuestions = new String[questions.length + 2];
        for (int i = 0; i < questions.length; i++) {
            newQuestions[i] = questions[i];
        }
        newQuestions[questions.length] = questionTwo;
        newQuestions[questions.length + 1] = questionThree;

        questions = newQuestions;

        Integer[][][] answerOptionsAndCorrectAnswers = {
                {
                        {answerFirstOptionForQuestionOne, answerSecondOptionForQuestionOne, answerThirdOptionForQuestionOne, answerFourthOptionForQuestionOne, answerFifthOptionForQuestionOne},
                        {correctAnswerForQuestionOne}
                },
                {
                        {answerFirstOptionForQuestionTwo, answerSecondOptionForQuestionTwo, answerThirdOptionForQuestionTwo},
                        {correctAnswerForQuestionTwo}
                },
                {
                        {answerFirstOptionForQuestionThree, answerSecondOptionForQuestionThree, answerThirdOptionForQuestionThree, answerFourthOptionForQuestionThree},
                        {correctAnswerForQuestionThree}
                }
        };

        for (int i = 0; i < questions.length; i++) {
            String question = questions[i];
            System.out.println("(" + (i + 1) + ")" + question);

            for (int j = 0; j < answerOptionsAndCorrectAnswers[i][0].length; j++) {
                System.out.println((j + 1) + ".вариант:	" + answerOptionsAndCorrectAnswers[i][0][j]);
            }
            System.out.print("Ваш ответ: №");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                int answerOption = scanner.nextInt() - 1;

                if (answerOption < (answerOptionsAndCorrectAnswers[i][0].length) && answerOption >= 0) {

                    Integer correctAnswer = answerOptionsAndCorrectAnswers[i][1][0];

                    if (answerOptionsAndCorrectAnswers[i][0][answerOption].equals(correctAnswer)) {
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