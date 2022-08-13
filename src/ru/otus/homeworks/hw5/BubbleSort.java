package ru.otus.homeworks.hw5;

import java.util.List;

public class BubbleSort {
    protected static void BubbleSortVerClassic(List<Integer> array) {
        int tempValue;

        for (int k = array.size() - 1; k > 0; k--) {

            for (int i = 0; i < k; i++) {
                if (array.get(i) > array.get(i + 1)) {
                    tempValue = array.get(i);
                    array.set((i), array.get(i + 1));
                    array.set(i + 1, tempValue);
                }
            }
        }
    }
    protected static void BubbleSortVerChangeMaxAndMinPosition(List<Integer> array) {
        int tempValue;
        int currentPosition;
        int maxPosition;
        int changedMaxPosition = array.size() - 1;
        int minPosition = 0;
        boolean noChanges;

        for (maxPosition = array.size() - 1; maxPosition >= 0; minPosition++) {
            noChanges = true;

            for (currentPosition = minPosition; currentPosition < maxPosition; currentPosition++) {
                if (array.get(currentPosition) > array.get(currentPosition + 1)) {
                    tempValue = array.get(currentPosition + 1);
                    array.set(currentPosition + 1, array.get(currentPosition));
                    array.set(currentPosition, tempValue);

                    noChanges = false;
                    changedMaxPosition = currentPosition;
                }
                if (array.get(currentPosition) < array.get(minPosition)) {
                    tempValue = array.get(minPosition);
                    array.set(minPosition, array.get(currentPosition));
                    array.set(currentPosition, tempValue);

                    noChanges = false;
                }
                if (array.get(currentPosition) > array.get(maxPosition)) {
                    tempValue = array.get(maxPosition);
                    array.set(maxPosition, array.get(currentPosition));
                    array.set(currentPosition, tempValue);

                    noChanges = false;
                }
            }
            if (noChanges) {
                break;
            }

            maxPosition = changedMaxPosition;
        }

    }

}
