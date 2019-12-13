package practice.arrays;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author AjayDeepakSrinivasan on 04-12-2019, 14:20
 * @project Algos&Ds
 * Given an array of distinct integers A[ ], write a program to find all pairs of elements with the minimum absolute difference of any two elements. Return a list of pairs in ascending order (with respect to pairs), each pair [i, j] follows :
 * <p>
 * i , j are from A[ ]
 * i < j
 * j - i equals to the minimum absolute difference of any two elements in A[ ].
 * <p>
 * Example 1
 * <p>
 * Input: A[] = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 * <p>
 * Example 2
 * <p>
 * Input: A[] = [1,3,6,10,15]
 * Output: [[1,3]]
 */

public class MinimumDiff {

    public static void main(String[] args) {
        int A[] = {1, 3, 6, 10, 15};
        int n = A.length;
        int value = 0;

        Arrays.sort(A);
        value = A[1] - A[0];
        for (int i = 2; i < n; ++i) {
            value = Math.min(value, (A[i] - A[i - 1]));
        }
        System.out.println(value);
    }
}
