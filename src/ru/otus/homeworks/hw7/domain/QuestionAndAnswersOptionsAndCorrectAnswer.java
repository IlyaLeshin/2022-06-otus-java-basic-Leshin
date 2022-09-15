package ru.otus.homeworks.hw7.domain;

import java.util.Arrays;

public class QuestionAndAnswersOptionsAndCorrectAnswer {
    private final String question;
    private final String[] answerOptions;
    private final Integer NumCorrectAnswer;

    public QuestionAndAnswersOptionsAndCorrectAnswer(String question, String[] answerOptions, Integer numCorrectAnswer) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.NumCorrectAnswer = numCorrectAnswer;
    }

    public int getNumCorrectAnswer() {
        return NumCorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswerOptions() {
        return answerOptions;
    }

    public Integer lengthAnswerOptions() {
        return answerOptions.length;
    }

    @Override
    public String toString() {

        return "" + question + Arrays.toString(answerOptions);
    }

    public void print(int questionIndex) {
        System.out.println("Вопрос №" + (questionIndex + 1) + ": " + question);
        for (int j = 0; j < answerOptions.length; j++) {
            System.out.println("Вариант ответа №" + (j + 1) + ": " + answerOptions[j]);
        }
    }
}