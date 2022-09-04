package ru.otus.homeworks.hw4;

class QuestionAndAnswersOptionsAndCorrectAnswer {
    private final String question;
    private final String[] answerOptions;
    private final Integer NumCorrectAnswer;
    protected QuestionAndAnswersOptionsAndCorrectAnswer(String question, String[] answerOptions, Integer numCorrectAnswer) {
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
}