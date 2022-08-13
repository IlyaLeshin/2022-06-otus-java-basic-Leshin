package ru.otus.homeworks.hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkOOP {
    public static void main(String[] args) {

        Count correctCount = new Count(0);
        Count wrongCount = new Count(0);

        QuestionAndAnswersOptionsAndCorrectAnswer questionOne = new QuestionAndAnswersOptionsAndCorrectAnswer(
                "Выберете правильный номер варианта ответа (А5Q1 is correct)",
                new String[]{"А1Q1", "А2Q1", "А3Q1", "А4Q1", "А5Q1"},
                5);
        QuestionAndAnswersOptionsAndCorrectAnswer questionTwo = new QuestionAndAnswersOptionsAndCorrectAnswer(
                "Выберете правильный номер варианта ответа (А2Q2 is correct)",
                new String[]{"А1Q2", "А2Q2", "А3Q2"},
                2);

        QuestionAndAnswersOptionsAndCorrectAnswer questionThree = new QuestionAndAnswersOptionsAndCorrectAnswer(
                "Выберете правильный номер варианта ответа (А1Q3 is correct)",
                new String[]{"А1Q3", "А2Q3", "А3Q3", "А4Q3"},
                1);

        ArrayList<QuestionAndAnswersOptionsAndCorrectAnswer> questionsArr = new ArrayList<>();
        questionsArr.add(questionOne);
        questionsArr.add(questionTwo);
        questionsArr.add(questionThree);

        for (int i = 0; i < questionsArr.size(); i++) {
            System.out.println("Вопрос №"+(i+1)+": "+questionsArr.get(i).getQuestion());
            for (int j = 0; j < questionsArr.get(i).getAnswerOptions().length; j++) {
                System.out.println("Вариант ответа №" + (j + 1) + ": " + questionsArr.get(i).getAnswerOptions()[j]);
            }

            System.out.print("Ваш ответ: №");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                Integer answerOption = scanner.nextInt();
                if (answerOption <= (questionsArr.get(i).lengthAnswerOptions()) && answerOption > 0) {
                    if (answerOption.equals(questionsArr.get(i).getNumCorrectAnswer())) {
                        System.out.println("Великолепно! Это правильный ответ");
                        correctCount.plusCount();
                    } else {
                        System.out.println("Неверно! Правильный ответ: " + questionsArr.get(i).getNumCorrectAnswer());
                        wrongCount.plusCount();
                    }
                    break;
                } else {
                    System.out.println("Вы ошиблись при вводе, попробуйте еще раз");
                    System.out.print("Ваш ответ: №");
                }
            }
            System.out.println("===	===	===	===	===");
        }
        System.out.println("Результат: правильно " + correctCount.getCount() + ", неправильно " + wrongCount.getCount());
    }
}


