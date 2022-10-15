CREATE DATABASE Homework_sql;

CREATE TABLE question (
    question_id SERIAL PRIMARY KEY,
    question varchar(300)
);

CREATE TABLE answerOption(
    answerOption_id float PRIMARY KEY,
    answerOption varchar(300) NOT NULL,
    question_id INT REFERENCES question(question_id)
);

CREATE TABLE rightAnswer(
    question_id INT REFERENCES question(question_id),
    answerOption_id float REFERENCES answerOption(answerOption_id)
);

INSERT INTO question(
    question_id, question)
VALUES
    (1, 'Выберете вариант ответа (A1Q1 верный)'),
    (2, 'Выберете вариант ответа (A3Q2 верный)'),
    (3, 'Выберете вариант ответа (A5Q3 верный)');

SELECT * FROM question;

INSERT INTO answerOption(
    answerOption_id, answerOption, question_id)
VALUES
    (1.1, 'вариант ответа A1Q1', 1),
    (1.2, 'вариант ответа A2Q1', 1),
    (1.3, 'вариант ответа A3Q1', 1),
    (1.4, 'вариант ответа A4Q1', 1),
    (2.1, 'вариант ответа A1Q2', 2),
    (2.2, 'вариант ответа A2Q2', 2),
    (2.3, 'вариант ответа A3Q2', 2),
    (3.1, 'вариант ответа A1Q3', 3),
    (3.2, 'вариант ответа A2Q3', 3),
    (3.3, 'вариант ответа A3Q3', 3),
    (3.4, 'вариант ответа A4Q3', 3),
    (3.5, 'вариант ответа A5Q3', 3);

SELECT * FROM answerOption;

SELECT question.*, answerOption.*
    LEFT FROM question JOIN answerOption ON question.question_id = answerOption.question_id;

INSERT INTO rightAnswer(question_id, answerOption_id)
Values
    (1,1.1),
    (2,2.3),
    (3,3.5);

SELECT * FROM rightAnswer;

SELECT question.question_id, question.question, answerOption.answerOption, rightAnswer.answeroption_id
FROM question JOIN answerOption ON question.question_id = answerOption.question_id
              JOIN rightAnswer ON answerOption.answeroption_id = rightAnswer.answeroption_id;

SELECT question.question_id, question.question, answerOption.answerOption, rightAnswer.answeroption_id
FROM question JOIN answerOption ON question.question_id = answerOption.question_id
              LEFT JOIN rightAnswer ON answerOption.answeroption_id = rightAnswer.answeroption_id;

DROP TABLE
    question,
    rightanswer,
    answeroption
    CASCADE;