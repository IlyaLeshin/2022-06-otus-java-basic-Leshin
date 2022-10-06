package ru.otus.homeworks.hw7.services;

import ru.otus.homeworks.hw7.app.services.*;
import ru.otus.homeworks.hw7.domain.*;


import java.util.InputMismatchException;
import java.util.List;

public class QuizRunner {
    private final IOService ioService;
    private final List<QuestionAndAnswersOptionsAndCorrectAnswer> questionAndAnswersOptionsAndCorrectAnswerDataBase;

    public QuizRunner(IOService ioService, List<QuestionAndAnswersOptionsAndCorrectAnswer> questionAndAnswersOptionsAndCorrectAnswerDataBase) {
        this.ioService = ioService;
        this.questionAndAnswersOptionsAndCorrectAnswerDataBase = questionAndAnswersOptionsAndCorrectAnswerDataBase;
    }

    public void run() {
        Count correctCount = new Count(0);
        Count wrongCount = new Count(0);

        for (int i = 0; i < questionAndAnswersOptionsAndCorrectAnswerDataBase.size(); i++) {
            QuestionAndAnswersOptionsAndCorrectAnswer tempCurrentQuestion = questionAndAnswersOptionsAndCorrectAnswerDataBase.get(i);
            Integer tempCorrectAnswerOfCurrentQuestion = tempCurrentQuestion.getNumCorrectAnswer();

            ioService.outputString("Вопрос №" + (i + 1) + ": " + tempCurrentQuestion.getQuestion());
            for (int j = 0; j < tempCurrentQuestion.getAnswerOptions().length; j++) {
                ioService.outputString("Вариант ответа №" + (j + 1) + ": " + tempCurrentQuestion.getAnswerOptions()[j]);
            }

            while (true) {
                Integer answerOption = null;
                boolean tempBoolean = true;

                do {
                    try {
                        ioService.outputString("Ваш ответ: №");
                        answerOption = ioService.readInteger();
                        tempBoolean = false;
                    } catch (InputMismatchException e) {
                        ioService.outputString("(InputMismatchException)Вы ошиблись при вводе, нужно ввести номер варианта ответа цифрой, попробуйте еще раз");
                        ioService.readString();
                    }
                } while (tempBoolean);

                if (answerOption <= (tempCurrentQuestion.lengthAnswerOptions()) && answerOption > 0) {
                    if (answerOption.equals(tempCorrectAnswerOfCurrentQuestion)) {
                        ioService.outputString("Великолепно! Это правильный ответ");
                        correctCount.plusCount();
                    } else {
                        ioService.outputString("Неверно! Правильный ответ: " + tempCurrentQuestion.getNumCorrectAnswer());
                        wrongCount.plusCount();
                    }
                    break;

                } else {
                    ioService.outputString("Вы ошиблись при вводе, попробуйте еще раз");
                }
            }
            ioService.outputString("===	===	===	===	===");
        }
        ioService.outputString("Результат: правильно " + correctCount.getCount() + ", неправильно " + wrongCount.getCount());
    }
}