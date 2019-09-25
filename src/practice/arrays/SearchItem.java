package practice.arrays;

/**
 * @author AjayDeepakSrinivasan on 09-09-2019, 13:52
 * @project Algos&Ds
 *
 * Problem:
 *
 *
Search index of an element in a sorted and rotated array

An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array
at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the
rotated array in O(log n) time.
 */


public class SearchItem {

    public static void main(String []args){

    }

    static  int searchItem(int arr[], int key){

        // finding midpoint
        int mid = arr.length/2;

        if( arr[mid] == key) {
          return mid;
        }

  return 0;
    }
}
