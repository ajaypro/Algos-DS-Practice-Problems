package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author AjayDeepakSrinivasan on 29-08-2019, 10:09
 * @project Algos&Ds
 * <p>
 * Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.
 * <p>
 * Algo steps
 */
public class ReverseArrayGroup {

    public static void main(String[] args) {

        int k = 3;
        int[] arr = {5, 8, 12, 9, 3, 7, 2};
        reverseArray(arr, k);
    }

    static void reverseArray(int arr[], int k) {

        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            int temp;

            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left = left + 1;
                right = right - 1;
            }
        }
        print(arr);
    }

    static void print(int arr[]) {
        System.out.println("Reversed array is: \n");
        for (int z = 0; z < arr.length; z++) {
            System.out.println(arr[z]);
        }
    }
}
