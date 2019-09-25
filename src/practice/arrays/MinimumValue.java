package practice.arrays;

import java.util.Arrays;

/**
 * @author AjayDeepakSrinivasan on 13-09-2019, 11:39
 * @project Algos&Ds
 * <p>
 * <p>
 * Minimize the sum of product of two arrays with permutations allowed
 * <p>
 * Given two arrays, A and B, of equal size n, the task is to find the minimum value of A[0] * B[0] + A[1] * B[1] +…+ A[n-1] * B[n-1]. Shuffling of elements of arrays A and B is allowed.
 * <p>
 * Examples :
 * <p>
 * Input : A[] = {3, 1, 1} and B[] = {6, 5, 4}.
 * Output : 23
 * Minimum value of S = 1*6 + 1*5 + 3*4 = 23.
 * <p>
 * Input : A[] = { 6, 1, 9, 5, 4 } and B[] = { 3, 4, 8, 2, 4 }
 * Output : 80.
 * Minimum value of S = 1*8 + 4*4 + 5*4 + 6*3 + 9*2 = 80.
 *
 * Solution:
 * Sort both arrays so that you will have values in increasing order.
 * Now in second array go to last item and multiply with first item of first array.
 * formula to go last element arr[arr.length -i -1]
 *
 */


public class MinimumValue {

    public static void main(String[] args) {

        int A[] = {6, 1, 9, 5, 4};
        int B[] = {3, 4, 8, 2, 4};

        sort(A, B);

        int n = A.length;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i] * B[n - i - 1];
        }
        System.out.println(sum);
        // considering one array length as length of both arrays are equal
    }


    private static void sort(int arr1[], int arr2[]) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
