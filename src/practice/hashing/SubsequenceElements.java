package practice.hashing;

import java.util.HashSet;

/**
 * @author AjayDeepakSrinivasan on 04-09-2019, 12:55
 * @project Algos&Ds
 *
 * Given an array of integers, find the length of the longest sub-sequence such that elements
 * in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 */

public class SubsequenceElements {

    public static void main(String[] args) {

        int arr[] = {1, 9, 3, 10, 4, 20, 2};

        System.out.println("Longest subsequence " +getSubSequence(arr));
    }

    private static int getSubSequence(int arr[]) {

        HashSet<Integer> hashSet = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hashSet.contains(arr[i] - 1)) {
                int j = arr[i];
                while (hashSet.contains(j)) {
                    j++;
                }
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }
}
