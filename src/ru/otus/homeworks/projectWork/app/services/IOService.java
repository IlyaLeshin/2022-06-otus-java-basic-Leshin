package ru.otus.homeworks.projectWork.app.services;

public interface IOService {

    void outputInteger(Integer integer);

    Integer readInteger();

    void outputString(String string);

    void outputString(String template, Object ...args);

    String readString();
}