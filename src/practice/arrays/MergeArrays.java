package practice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 Mering two arrays after sorting which gives better performance
 */

public class MergeArrays {
    public static void main(String []args){
        int a[] = {1, 10, 5, 15};
        int b[] = {20, 0, 2};

        mergeSort(a, b);
    }

    private static void mergeSort(int arr[], int arr1[]){
        // arrays sorted
        Arrays.sort(arr);
        Arrays.sort(arr1);

        //Merging two arrays

         int length = arr.length + arr1.length;
         int [] result = new int[length];
         int pos = 0;
        for(int item: arr){
            result[pos] = item;
            pos++;
        }

        for(int item: arr1){
            result[pos] = item;
            pos++;
        }
          Arrays.sort(result);
        System.out.println(Arrays.toString(result));



        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));




    }
}
