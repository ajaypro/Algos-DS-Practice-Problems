package practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author AjayDeepakSrinivasan on 11-10-2019, 10:26
 * @project Algos&Ds
 * <p>
 * Problem Description: Given an unsorted array A[] consisting of n integers,
 * you need to find the length of the longest consecutive sequence of integers in the array.
 */

public class LongestConSequenceT {

    public static void main(String[] args) {

        int arr[] = { 3, 10, 4, 20, 2, 1, 9};

        System.out.println("Length of the Longest consecutive subsequence is " + lonSequence(arr));

    }

    static int lonSequence(int arr[]) {

        // Edge cases

        if (arr.length <= 1) {
            return 0;
        }

        int longStreak = 0;

        HashSet<Integer> hashset = new HashSet<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            hashset.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {

            // finding if sequence is present from current number

            if (!hashset.contains(arr[i] - 1)) {
                int currentNum = arr[i];

                /**
                 *   having current element in arr[i], increment from that to find next consective numbers
                 *   if not found then currentNum is updated
                 *   now to find longest subsequence we find the difference of currentNum and current element in arr[i]
                 *   then again we increment i and move to next element and repeat above steps
                 */


                while (hashset.contains(currentNum))
                    currentNum++;

                if (longStreak < currentNum - arr[i])
                    longStreak = currentNum - arr[i];
            }
        }
        return longStreak;
    }
}
