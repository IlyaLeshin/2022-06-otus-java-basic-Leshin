package ru.otus.homeworks.hw7.domain;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionAndAnswersOptionsAndCorrectAnswerDataBase {
    public static List<QuestionAndAnswersOptionsAndCorrectAnswer> Create() {

        List<QuestionAndAnswersOptionsAndCorrectAnswer> questionsArr = new ArrayList<>();

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

        questionsArr.add(questionOne);
        questionsArr.add(questionTwo);
        questionsArr.add(questionThree);

        return questionsArr;
    }

    public static void loadFile() {
        String pathToFile = "\\QuizBase.txt";

        ClassLoader classLoader = QuestionAndAnswersOptionsAndCorrectAnswerDataBase.class.getClassLoader();
        try (OutputStream output = Files.newOutputStream(Path.of(pathToFile))) {
            System.out.println("Попытка чтения из файла методом loadFile");
        } catch (IOException e) {
            System.out.println("(IOException) Файл не найден ");
        }
    }

    public static void connectionToFile() throws SQLException {

        try {
            throw new SQLException("(SQLException) Попытка выполнить метод connectionToFile, нет доступа к базе данных");
        } catch (SQLException e) {
            System.out.println("(SQLException) Здесь будет запись ошибки в log.err, далее прокидывам дальше ");
            throw e;
        }
    }
}