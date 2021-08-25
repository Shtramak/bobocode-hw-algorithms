package ua.shtramak;

import java.util.Objects;

public class MergeSort {
    private static int numberOfIterations;

    private MergeSort() {
    }

    public static int sort(int[] array) {
        Objects.requireNonNull(array);
        numberOfIterations = 0;
        mergeSort(array);
        return numberOfIterations;
    }

    private static void mergeSort(int[] array) {
        numberOfIterations++;
        int length = array.length;
        if (length < 2) {
            return;
        }
        int midIndex = length / 2;
        int[] leftArray = subArrayFrom(array, 0, midIndex);
        int[] rightArray = subArrayFrom(array, midIndex, length);
        mergeSort(leftArray);
        mergeSort(rightArray);

        sortLeftAndRightArrays(array, leftArray, rightArray);
    }

    private static void sortLeftAndRightArrays(int[] resultArray, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                numberOfIterations++;
                resultArray[resultIndex++] = leftArray[leftIndex++];
            } else {
                numberOfIterations++;
                resultArray[resultIndex++] = rightArray[rightIndex++];
            }
        }
        while (leftIndex < leftLength){
            numberOfIterations++;
            resultArray[resultIndex++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightLength){
            numberOfIterations++;
            resultArray[resultIndex++] = rightArray[rightIndex++];
        }
    }

    private static int[] subArrayFrom(int[] array, int startIndex, int endIndex) {
        int[] result = new int[endIndex - startIndex];
        int index = 0;
        for (int i = startIndex; i < endIndex; i++) {
            result[index++] = array[i];
        }
        return result;
    }

}
