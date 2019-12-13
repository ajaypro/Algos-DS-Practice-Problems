package practice.arrays;

import java.util.HashMap;

/**
 * @author AjayDeepakSrinivasan on 06-11-2019, 10:46
 * @project Algos&Ds
 * <p>
 * Problem : You are given an array A[] consisting of n elements. You need to find and return the number which appears more than n/2 times.
 */


public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 5, 4, 12, 4, 4, 4};
        int n = arr.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();
         int count =1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            } else {
                int currCount = map.get(arr[i]);
                map.put(arr[i], currCount + 1);
            }
        }
        //map.forEach((k, v) -> System.out.println(k + " " + v));

        map.forEach((k,v)-> {
            if(v > n){
                System.out.println("Array element : "+k);
            } else {
              System.out.println("No major element is present");
            }
        });
    }
}
