package practice.hashing;

import practice.util.CustomInput;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author AjayDeepakSrinivasan on 27-09-2019, 11:59
 * @project Algos&Ds
 * <p>
 * First element to occur k times
 * Given an array of N integers. The task is to find the first element that occurs K number of times.
 * If no element occurs K times the print -1.
 */

public class ElementKtimes {

    public static void main(String[] args) {


        int arr[] = {2,4,7,9,12};
        int k= 2;
        System.out.println(repeatElements(CustomInput.arr, k));
    }


    static int repeatElements(int arr[], int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            //int finalI = i;
            //hashMap.compute(arr[finalI], (key, value) -> (value == null) ? hashMap.put(arr[finalI], 1) : hashMap.put(arr[finalI], hashMap.get(arr[finalI]) + 1));

            if(!hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], 1);
            else {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
        }

        hashMap.forEach((t,v) -> {
            System.out.println(" array item : " + t  +"  "+  v + " times");
        });

        if(hashMap.containsValue(k)) return 1;
        else {
            return -1;
        }

    }


}
