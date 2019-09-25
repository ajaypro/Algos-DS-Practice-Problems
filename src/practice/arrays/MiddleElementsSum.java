package practice.arrays;

import java.util.Arrays;

/**
 * @author AjayDeepakSrinivasan on 10-09-2019, 10:18
 * @project Algos&Ds
 * <p>
 * Given 2 sorted arrays A and B of size N each. Print sum of middle elements of the array obtained after merging the given arrays.
 * <p>
 * sol:
 * Find middle item of both arrays by mid = arrlength/2
 */

public class MiddleElementsSum {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 6};
        int arr2[] = {4, 6, 8, 10};
        sumofMiddleElements(arr1, arr2);
    }

    static void sumofMiddleElements(int arr1[], int arr2[]) {

        int mergedArrayLength = arr1.length + arr2.length;
        int mergedArray[] = new int[mergedArrayLength];
        int position = 0;

        for (int item : arr1) {
            mergedArray[position] = item;
            position++;
        }

        for (int item : arr2) {
            mergedArray[position] = item;
            position++;
        }

        Arrays.sort(mergedArray);
        int mid = (mergedArray.length -1) /2;

        int midValue = mergedArray[mid];
        int sum = midValue + mergedArray[mid+1];

        System.out.println("midValue :" + midValue);
        System.out.println("sum is :" + sum);

        for (int value : mergedArray) {
            System.out.println(value);
        }


    }


}
