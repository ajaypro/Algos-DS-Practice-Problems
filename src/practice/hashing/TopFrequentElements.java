package practice.hashing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author AjayDeepakSrinivasan on 24-08-2019, 14:44
 * @project Algos&Ds
 * <p>
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * <p>
 * Note:
 * <p>
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */


public class TopFrequentElements {

    public static void main(String[] args) {

        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int noElementfrequency = 2;
        int []result = topFrequentElements(arr);


        if (result.length == noElementfrequency) {
            System.out.println(noElementfrequency + "frequenct elements " + Arrays.toString(result));
        }

    }

    static int[] topFrequentElements(int arr[]) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int elementFrequency = 1;
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) != null) {
                elementFrequency = hashMap.get(arr[i]);
            }

            hashMap.put(arr[i], elementFrequency);

        }
        int result[] = {arr.length};
        for (int i = 0; i < arr.length; i++) {

            if (hashMap.get(arr[i]) > elementFrequency) {
                result[i] = arr[i];
            }
            return  result;
        }
        return new int[0];
    }
}
