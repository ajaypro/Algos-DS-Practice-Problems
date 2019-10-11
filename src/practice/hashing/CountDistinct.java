package practice.hashing;

import java.util.HashMap;

/**
 * @author AjayDeepakSrinivasan on 01-10-2019, 11:03
 * @project Algos&Ds
 * Problem: Count distinct elements in every window
 * Given an array A[] of size N and an integer K. Your task is to complete the function countDistinct()
 * which prints the count of distinct numbers in all windows of size k in the array A[]
 */


public class CountDistinct {

    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 9, 9, 10, 14, 16, 17};
        //int arr[] = {-40, -7, 1, 3, 6, 8, 20};
        int k = 3;

        countDistinct(arr, k);
    }

    static void countDistinct(int arr[], int k) {

        int distCount = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            if (hashMap.get(arr[i]) == null) {

                hashMap.put(arr[i], 1);
                distCount++;
            } else {

                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count + 1);
            }

            System.out.println(distCount);
        }

        for (int i = k; i < arr.length; i++) {

            if (hashMap.get(arr[i - k]) == 1) {
                hashMap.remove(arr[i - k]);
                distCount--;
            } else {
                int count = hashMap.get(arr[i - k]);
                hashMap.put(arr[i - k], count - 1);
            }

            // Add new element of current window
            // If this element appears first time,
            // increment distinct element count

            if (hashMap.get(arr[i]) == null) {

                hashMap.put(arr[i], 1);
                distCount++;
            } else {

                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count + 1);
            }

            System.out.println(distCount);
        }

    }


}
