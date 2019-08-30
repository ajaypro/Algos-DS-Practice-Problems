package practice.hashing;

import java.util.HashMap;

/**
 * @author AjayDeepakSrinivasan on 24-08-2019, 11:40
 * @project Algos&Ds
 * Given an array of n integers. The task is to find the first element that occurs k number of times. If no element occurs k times the print -1.
 * The distribution of integer elements could be in any range.
 */

public class KFrequentElements {

    static  int getFrequentElements(int arr[], int frequency) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int itemFrequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) != null) {
                itemFrequency = hashMap.get(arr[i]);
            }
            hashMap.put(arr[i], itemFrequency + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) == frequency) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String []args){

        int []arr = {1, 7, 4, 3, 4, 8, 7};
        int frequency = 2;
        int result = getFrequentElements(arr, frequency);

        if(result != -1){
            System.out.println("first element of frequency " + frequency+ " : " + result);
        }
    }
}
