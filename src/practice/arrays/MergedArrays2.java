package practice.arrays;

import java.util.*;

/**
 * @author AjayDeepakSrinivasan on 26-08-2019, 13:13
 * @project Algos&Ds
 *
 *
Find m-th smallest value in k sorted arrays
Given k sorted arrays of possibly different sizes, find m-th smallest value in the merged array.

Examples:

Input: m = 5
arr[][] = { {1, 3},
{2, 4, 6},
{0, 9, 10, 11}} ;
Output: 4
Explanation The merged array would
be {0 1 2 3 4 6 9 10 11}.  The 5-th
smallest element in this merged
array is 4.

 Solution :

This Min Heap based solution has same time complexity which is O(nk Log k). But for different sized arrays, this solution works much better.

Following is detailed algorithm.
1. Create an output array of size n*k.
2. Create a min heap of size k and insert 1st element of all the arrays into the heap
3. Repeat following steps n*k times.
a) Get minimum element from heap (minimum is always at root) and store it in output array.
b) Replace heap root with next element from the array from which the element is extracted. If the array doesn’t have any more elements,
then replace root with infinite. After replacing the root, heapify the tree.
 */


public class MergedArrays2 {

    static class ArrayContainer implements Comparable<ArrayContainer> {
        int[] arr;
        int index;

        public ArrayContainer(int[] arr, int index) {
            this.arr = arr;
            this.index = index;
        }

        @Override
        public int compareTo(ArrayContainer o) {
            return this.arr[this.index] - o.arr[o.index];
        }
    }

    public static int[] mergeKSortedArray(int[][] arr) {
        //PriorityQueue is heap in Java
        PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
        int total=0;

        //add arrays to heap
        for (int i = 0; i < arr.length; i++) {
            queue.add(new ArrayContainer(arr[i], 0));
            total = total + arr[i].length;
        }

        int m=0;
        int result[] = new int[total];

        //while heap is not empty
        while(!queue.isEmpty()){
            ArrayContainer ac = queue.poll();
            result[m++]=ac.arr[ac.index];

            if(ac.index < ac.arr.length-1){
                queue.add(new ArrayContainer(ac.arr, ac.index+1));
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int[] arr3 = { 0, 9, 10, 11 };

        int[] result = mergeKSortedArray(new int[][] { arr1, arr2, arr3 });
        System.out.println(Arrays.toString(result));
    }

}
