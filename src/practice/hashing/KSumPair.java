package practice.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

/**
 * @author AjayDeepakSrinivasan on 30-09-2019, 12:14
 * @project Algos&Ds
 * <p>
 * Problem : Check for pair in an array with a given sum - Interview Problem 2
 * Solution: Given an array of n integers and given a number K, determines whether there is a pair of elements in the array that sums to exactly K.
 */

public class KSumPair {

    private static class Pair{

        int first, second;

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        int arr[] = {-40, -5, 1, 3, 6, 7, 8, 20};
        //int arr[] = {-40, -7, 1, 3, 6, 8, 20};
        int k = 15;

        System.out.println(isPairAvailable(arr, k));

        pairList(arr,k).forEach(pair -> System.out.println(pair.first + ", " +pair.second));


    }

    static boolean isPairAvailable(int arr[], int k) {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (!hashtable.contains(arr[i])) {
                hashtable.put(i, arr[i]);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int x = k - arr[i];
            if (hashtable.contains(x)) {

                list.add(x, arr[i]);
                System.out.println(x + "," + arr[i]);
                return true;
            }

        }

        return false;
    }

    static ArrayList<Pair> pairList(int arr[], int k) {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (!hashtable.contains(arr[i])) {
                hashtable.put(i, arr[i]);
            }
        }

        ArrayList<Pair> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int x = k - arr[i];
            if (hashtable.contains(x)) {
                list.add(new Pair(x, arr[i]));
                System.out.println(x + "," + arr[i]);
                return list;
            }

        }

        return null;
    }
}
