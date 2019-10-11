package practice.arrays;

/**
 * @author AjayDeepakSrinivasan on 08-10-2019, 12:16
 * @project Algos&Ds
 * <p>
 * Problem Description: Given an array A[] of size n, you need to find the maximum and minimum element present in the array.
 * Your algorithm should make the minimum number of comparisons.
 */

public class MaxMinArray {

    public static void main(String[] args) {

        int arr[] = {4, 2, 0, 8, 20, 9, 2};

         Pair pair = maxMin(arr);

        System.out.printf("\nMinimum element is %d", pair.min);
        System.out.printf("\nMaximum element is %d", pair.max);

    }

    static class Pair {

        int min;
        int max;
    }

    static Pair maxMin(int arr[]) {

        Pair pair = new Pair();
        int i;

        int max = 0;
        int min = 0;

        if (arr.length % 2 == 0) {
            if (arr[0] > arr[1]) {
                pair.max = arr[0];
                pair.min = arr[1];
            } else {
                pair.min = arr[0];
                pair.max = arr[1];
            }
            i = 2;

        } else {
            pair.max = arr[0];
            pair.min = arr[0];
            i = 1;
        }
        while (i < arr.length - 1) {

            if (arr[i] > arr[i + 1]) {
                if (arr[i] > pair.max) {
                    pair.max = arr[i];
                }
                if (arr[i + 1] < pair.min) {
                    pair.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > pair.max) {
                    pair.max = arr[i + 1];
                }
                if (arr[i] < pair.min) {
                    pair.min = arr[i];
                }
            }
            i += 2;
        }

        return pair;
    }
}
