package ua.shtramak;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertionSortTest {
    private int[] reversedArray;
    private int[] sortedArray;
    private int[] randomArray;
    private static final int SIZE = 1000;

    @BeforeEach
    void init(){
        reversedArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            reversedArray[i] = SIZE - i;
        }

        sortedArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            sortedArray[i] = i;
        }

        randomArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            randomArray[i] = ThreadLocalRandom.current().nextInt(SIZE);
        }
    }

    @Test
    void testWhenSorted() {
        int[] expectedArray = new int[SIZE];
        System.arraycopy(sortedArray, 0, expectedArray, 0, SIZE);
        System.out.println(InsertionSort.sort(sortedArray));
        assertTrue(Arrays.equals(expectedArray, sortedArray));
    }

    @Test
    void testWhenReverse() {
        System.out.println(InsertionSort.sort(reversedArray));
        int[] expectedArray = new int[SIZE];
        System.arraycopy(reversedArray, 0, expectedArray, 0, SIZE);
        Arrays.sort(expectedArray);
        assertTrue(Arrays.equals(expectedArray, reversedArray));
    }

    @Test
    void testWhenMixed() {
        System.out.println(InsertionSort.sort(randomArray));
        int[] expectedArray = new int[SIZE];
        System.arraycopy(randomArray, 0, expectedArray, 0, SIZE);
        Arrays.sort(expectedArray);
        assertTrue(Arrays.equals(expectedArray, randomArray));
    }
}