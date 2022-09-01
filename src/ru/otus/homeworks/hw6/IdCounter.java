package ru.otus.homeworks.hw6;

import java.util.concurrent.atomic.AtomicLong;

public class IdCounter {
    private static final AtomicLong clientIdCounter = new AtomicLong();
    private static final AtomicLong accountIdCounter = new AtomicLong();

    public static String createClientID() {
        return String.valueOf(clientIdCounter.getAndIncrement());
    }

    public static String createAccountID() {
        return String.valueOf(accountIdCounter.getAndIncrement());
    }
}