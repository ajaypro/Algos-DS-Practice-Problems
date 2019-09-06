package practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author AjayDeepakSrinivasan on 06-09-2019, 10:50
 * @project Algos&Ds
 */
public class MissingRepeating {

    public static void main(String[] args) {
        //int arr[] = {4, 3, 6, 2, 1, 1};
        //int arr[] = {44, 43, 45, 47, 47};
        int arr[] = {144, 143, 145, 147, 147};

        missingAndRepeating(arr);
    }

   /* private static void missingAndRepeating(int arr[]) {
        int countArray[] = new int[arr.length];

      System.out.print("The repeating element is ");

      for(int i= 0; i< arr.length; i++){
        int val = Math.abs(arr[i]);

        if(arr[val -1] > 0){
          arr[val -1] = -arr[val -1];
        } else {
          System.out.println(val);
        }
      }

      System.out.print("The missing element is ");
      //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);

        }
    }*/

    private static void missingAndRepeating(int[] arr) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], true);
            } else {
                System.out.println("repeated number is " + arr[i]);
            }

        }
         int first = arr[0]; // from where the loop starts to look for missing number

        int largest = 0 ; // find largest to use in loop to iterate till

        for(int j = 0; j < arr.length-1; j++){
            if(arr[j] >= arr[j+1]){
                largest = arr[j];
            } else {
                largest = arr[j+1];
            }
        }

        for(int i = first; i< largest; i++){

          if(map.get(i) == null){
            System.out.println("Missing number: " + i);
          }
        }

    }
}


