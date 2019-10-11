package practice.arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author AjayDeepakSrinivasan on 26-09-2019, 17:09
 * @project Algos&Ds
 * <p>
 * Problem Description : Given two integer array A[] and B[] of size m and n(n <= m) respectively. We have to check whether B[] is a subset of A[] or not.
 * An array B is a subset of another array A if each element of B is present in A. (There are no repeated elements in both the arrays)
 * <p>
 * input : A[] = { 3, 5, 7, 12, 1, 9, 10, 0, 2 }, B[] = { 1, 3, 5, 9 }
 * <p>
 * Output : True (B[] is subset of A[])
 * <p>
 * Input : A[] = { 3, 5, 7, 12, 1, 9, 10, 0, 2 }, B[] = { 6, 3, 8 }
 * <p>
 * Output: False (B[] is not a subset of A[])
 */

public class FindSubarray {

    public static void main(String[] args) {

        int A[] = {3, 5, 7, 12, 1, 9, 10, 0, 2};
        int B[] = {9, 3, 8};
        int value = subArray(A, B);

        if(value == 1){
            System.out.println("B is subset of A");
        } else {
            System.out.println("B is not subset of A");
        }


    }

    static int subArray(int arr[], int arr2[]) {

        Arrays.sort(arr);
        Arrays.sort(arr2);

        HashSet<Integer> hashSet = new HashSet<>(arr.length);

        for (int item : arr)
            hashSet.add(item);

        /** So here it will return -1 when it doesn't find a value in array,
         *  i.e even if one element is not present B is not subset of A.
          */
        for (int i = 0; i < arr2.length; i++) {
            if (!hashSet.contains(arr2[i])) {
                return -1;
            }

        }
        return 1;
    }
}
