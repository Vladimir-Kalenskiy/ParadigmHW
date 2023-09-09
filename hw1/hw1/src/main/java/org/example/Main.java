package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        BubbleSort(numbers);

        for (int num: numbers) {
            System.out.println(num);
        }
    }

    public static void BubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++;) {
            for(int j = 1; j < array.length; j++;) {
                if(array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}