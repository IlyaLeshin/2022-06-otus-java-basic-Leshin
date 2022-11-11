package ru.otus.homeworks.projectWork.test;


import ru.otus.homeworks.projectWork.test.unitTests.Test01;
import ru.otus.homeworks.projectWork.test.unitTests.Test02;

public class AllTests {
    public static void run() {

        Test01.testRUB();
        Test01.testUSD();
        Test01.testCNY();
        Test01.testJPY();

        Test02.testRUBToString();
        Test02.testUSDToString();
        Test02.testCNYToString();
        Test02.testJPYToString();
    }
}