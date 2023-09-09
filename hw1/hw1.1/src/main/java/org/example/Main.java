package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        Integer[] numbers2 = {1, 2, 3, 4, 5};
        // Императивная парадигма
        BubbleSort(numbers1);
        // Декларативная парадигма
        Arrays.sort(numbers2, Collections.reverseOrder());

        for (int num : numbers1) {
            System.out.print(num + " ");
        }

        System.out.println("\n-*-*-*-*-");

        for (int num1 : numbers2) {
            System.out.print(num1 + " ");
        }
    }

    public static void BubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}