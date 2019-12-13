package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author AjayDeepakSrinivasan on 05-12-2019, 07:51
 * @project Algos&Ds
 * Problem Description: Given an array, find the smallest missing positive integer.
 * For example
 * <p>
 * Input: A[] = [2, 3, -7, 6, 8, 1, -10, 15]
 * Output: 4
 * <p>
 * Input: A[] = [3, 2, -1, 1]
 * Output: 4
 * <p>
 * Input: A[] = [7, 8, 9, 11, 12]
 * Output: 1
 */

public class MissingMinPositive {

    /*public static void main(String args[]) {
        int array[] = {2, 3, -7, 6, 8, 1, -10, 15};

        Arrays.sort(array);


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; ++i) {

            if (array[i] < 0) {
                System.out.println("Array does not contain positive values");
            }

            set.add(array[i]);
        }
        int arr[] = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            if (i > 0 && !set.contains(i))
                arr[i] = i;
            System.out.println(arr[i]);
        }

    }*/

    public static void main(String []args) {
        /*int A[] = {3, 2, -1, 1 };
        System.out.println(solution(A));*/


            int array[] = {3, 2, -1, 1};
            int number = Integer.MAX_VALUE;
            ArrayList al = new ArrayList();

            //Here we add all positive items into a ArrayList al
            for(int i=1;i<array.length;i++){
                al.add(array[i]);
            }

            Iterator it = al.iterator();
            while(it.hasNext()){
                int n = (Integer) it.next();
                if(n<number){
                    number = n;
                }
            }
            System.out.println("Smallest number : " + number);
        }


    /*static int solution(int[] A){

        int maxValue = Arrays.stream(A).max().getAsInt();

        if(maxValue < 1){
            return -1;
        }
        if (A.length == 1) {
            System.out.println("array contains only one element");
        }

        int i = 0;
        int[] tempArray = new int[maxValue];
        for (i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (tempArray[A[i] - 1] != 1) // Changing the value status at the index of our list
                {
                    tempArray[A[i] - 1] = 1;
                }
            }
        }
        for (i = 0; i < tempArray.length; i++) // Encountering first 0, i.e, the element with least value
        {
            if (tempArray[i] == 0) {
                return i + 1;
            }
        }
        // In case all values are filled between 1 and m
        return i + 2;
    }*/

    static  int solution(int[] array){
        boolean max_val_present = false;

        int min = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++) // Loop to find the smallest number in array[]
        {
            if(min > array[i] && array[i] > 0)
                min=array[i];
            //Edge Case, if all numbers are negative and a MAX value is present
            if(array[i] == Integer.MAX_VALUE)
                max_val_present = true;
        }

        if(min == Integer.MAX_VALUE && !max_val_present)
            //no positive value found and Integer.MAX_VALUE
            //is also not present, return -1 as indicator
            return -1;

        return min;
    }


}

