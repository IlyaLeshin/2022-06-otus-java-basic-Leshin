package ru.otus.homeworks.hw7.services;

import ru.otus.homeworks.hw7.app.services.IOService;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIOServiceImplements implements IOService {

    private final PrintStream out;
    private final Scanner in;

    public ConsoleIOServiceImplements() {
        out = System.out;
        in = new Scanner(System.in);
    }

    @Override
    public void outputInteger(Integer integer) {
        out.println(integer);
    }

    @Override
    public Integer readInteger() {
        return in.nextInt();
    }

     @Override
    public void outputString(String string) {
        {
            out.println(string);
        }
    }

    @Override
    public void outputString(String template, Object... args) {
        out.printf(template + "%n", args);
    }

    @Override
    public String readString() {
        return in.nextLine();
    }
}