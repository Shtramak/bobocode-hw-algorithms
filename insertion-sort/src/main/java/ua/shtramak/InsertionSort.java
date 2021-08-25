package ua.shtramak;

import java.util.Objects;

public class InsertionSort {
    private InsertionSort() {
    }

    public static int sort(int[] array) {
        Objects.requireNonNull(array);
        int numberOfIterations = 0;
        for (int i = 1; i < array.length; i++) {
            numberOfIterations++;
            int currentElement = array[i];
            int insertionIndex = i - 1;
            while (currentElement < array[insertionIndex]) {
                numberOfIterations++;
                array[insertionIndex + 1] = array[insertionIndex];
                array[insertionIndex] = currentElement;
                if (insertionIndex > 0) {
                    insertionIndex--;
                }
            }
        }
        return numberOfIterations;
    }
}
