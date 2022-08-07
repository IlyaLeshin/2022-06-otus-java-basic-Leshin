package ru.otus.homeworks.hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkOOP {
    public static void main(String[] args) {

        Count correctCount = new Count(0);
        Count wrongCount = new Count(0);

        Question questionOne = new Question("Выберете правильный номер варианта ответа (А5Q1 is correct)");
        Question questionTwo = new Question("Выберете правильный номер варианта ответа (А2Q2 is correct)");
        Question questionThree = new Question("Выберете правильный номер варианта ответа (А1Q3 is correct)");

        ArrayList<Question> questionsArr = new ArrayList<>();
        questionsArr.add(questionOne);
        questionsArr.add(questionTwo);
        questionsArr.add(questionThree);

        AnswerOptions answersForQuestionOne = new AnswerOptions(new String[]{"А1Q1", "А2Q1", "А3Q1", "А4Q1", "А5Q1"});
        AnswerOptions answersForQuestionTwo = new AnswerOptions(new String[]{"А1Q2", "А2Q2", "А3Q2"});
        AnswerOptions answersForQuestionThree = new AnswerOptions(new String[]{"А1Q3", "А2Q3", "А3Q3", "А4Q3"});

        ArrayList<AnswerOptions> answersArr = new ArrayList<>();
        answersArr.add(answersForQuestionOne);
        answersArr.add(answersForQuestionTwo);
        answersArr.add(answersForQuestionThree);

        NumCorrectAnswer numCorrectAnswerFoQuestionOne = new NumCorrectAnswer(5);
        NumCorrectAnswer numCorrectAnswerFoQuestionTwo = new NumCorrectAnswer(2);
        NumCorrectAnswer numCorrectAnswerFoQuestionThree = new NumCorrectAnswer(1);

        ArrayList<NumCorrectAnswer> numCorrectAnswersArr = new ArrayList<>();
        numCorrectAnswersArr.add(numCorrectAnswerFoQuestionOne);
        numCorrectAnswersArr.add(numCorrectAnswerFoQuestionTwo);
        numCorrectAnswersArr.add(numCorrectAnswerFoQuestionThree);

        for (int i = 0; i < questionsArr.size(); i++) {
            System.out.println("Вопрос №"+(i+1)+": "+questionsArr.get(i).getQuestion());
            for (int j = 0; j < answersArr.get(i).getAnswerOptions().length; j++) {
                System.out.println("Вариант ответа №" + (j + 1) + ": " + answersArr.get(i).getAnswerOptions()[j]);
            }

            System.out.print("Ваш ответ: №");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                Integer answerOption = scanner.nextInt();
                if (answerOption <= (answersArr.get(i).lengthAnswerOptions()) && answerOption > 0) {
                    if (answerOption.equals(numCorrectAnswersArr.get(i).getNumCorrectAnswer())) {
                        System.out.println("Великолепно! Это правильный ответ");
                        correctCount.plusCount();
                    } else {
                        System.out.println("Неверно! Правильный ответ: " + numCorrectAnswersArr.get(i).getNumCorrectAnswer());
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


class Count {
    private int count;

    public Count(int count) {
        this.count = count;
    }

    public void plusCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Question {
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

}

class AnswerOptions {
    private String[] answerOptions;

    public AnswerOptions(String[] answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String[] getAnswerOptions() {
        return answerOptions;
    }

    public Integer lengthAnswerOptions() {
        return answerOptions.length;
    }

}

class NumCorrectAnswer {
    private Integer NumCorrectAnswer;

    public NumCorrectAnswer(Integer numCorrectAnswer) {
        this.NumCorrectAnswer = numCorrectAnswer;
    }

    public Integer getNumCorrectAnswer() {
        return NumCorrectAnswer;
    }
}

