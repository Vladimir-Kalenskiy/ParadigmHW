package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};

        int min = 0;
        int max = arr.length - 1;
        int number = 3;

        System.out.println(binarySearch(arr, number, min, max));
    }

    public static int binarySearch(int[] sortedArray, int num, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < num) {
                low = mid + 1;
            } else if (sortedArray[mid] > num) {
                high = mid - 1;
            } else if (sortedArray[mid] == num) {
                index = mid;
                break;
            }
        }
        return index;
    }
}