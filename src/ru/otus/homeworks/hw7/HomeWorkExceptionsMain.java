package ru.otus.homeworks.hw7;

import ru.otus.homeworks.hw7.app.services.*;
import ru.otus.homeworks.hw7.domain.*;
import ru.otus.homeworks.hw7.services.*;

import java.sql.SQLException;
import java.util.List;

public class HomeWorkExceptionsMain {
    public static void main(String[] args) throws SQLException {

        IOService ioService = new ConsoleIOServiceImplements();

        List<QuestionAndAnswersOptionsAndCorrectAnswer> questionAndAnswersOptionsAndCorrectAnswerDataBase = QuestionAndAnswersOptionsAndCorrectAnswerDataBase.Create();

        QuizRunner quizRunner = new QuizRunner(ioService, questionAndAnswersOptionsAndCorrectAnswerDataBase);
        quizRunner.run();

        QuestionAndAnswersOptionsAndCorrectAnswerDataBase.loadFile();
        QuestionAndAnswersOptionsAndCorrectAnswerDataBase.connectionToFile();
    }
}