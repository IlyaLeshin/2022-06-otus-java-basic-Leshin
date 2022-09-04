package ru.otus.homeworks.hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWorkBubbleSortVsCollectionsSort {
    public static void main(String[] args) {
        int arrSize = 10_000;
        List<Integer> arrayForSort = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) {
            arrayForSort.add(((int) (Math.random() * 139) + 13));
        }
        List<Integer> arrayForBubbleSort1 = new ArrayList<>(arrayForSort);
        List<Integer> arrayForBubbleSort2 = new ArrayList<>(arrayForSort);

        System.out.println("Выполнение Collections.Sort:");
        long startTimeSort = System.currentTimeMillis();
        Collections.sort(arrayForSort);
        long endTimeSort = System.currentTimeMillis();
        System.out.println("время выполнения Collections.Sort: " + (endTimeSort - startTimeSort) + "миллисекунд");
        System.out.println("+++ +++ +++ +++ +++ +++ +++ +++");

        System.out.println("Выполнение arrayForBubbleSortClassic:");
        startTimeSort = System.currentTimeMillis();
        BubbleSort.BubbleSortVerClassic(arrayForBubbleSort1);
        endTimeSort = System.currentTimeMillis();
        System.out.println("Массив отсортирован: " + arrayForBubbleSort1.equals(arrayForSort));
        System.out.println("время выполнения arrayForBubbleSortClassic: " + (endTimeSort - startTimeSort) + "миллисекунд");
        System.out.println("+++ +++ +++ +++ +++ +++ +++ +++");


        System.out.println("Выполнение BubbleSortVerChangeMaxAndMinPosition:");
        startTimeSort = System.currentTimeMillis();
        BubbleSort.BubbleSortVerChangeMaxAndMinPosition(arrayForBubbleSort2);
        endTimeSort = System.currentTimeMillis();
        System.out.println(" Массив отсортирован: " + arrayForBubbleSort2.equals(arrayForSort));
        System.out.println("время выполнения BubbleSortVerChangeMaxAndMinPosition: " + (endTimeSort - startTimeSort) + "миллисекунд");
        System.out.println("+++ +++ +++ +++ +++ +++ +++ +++");

    }
}
