package practice.arrays;

/**
 * @author AjayDeepakSrinivasan on 02-12-2019, 19:06
 * @project Algos&Ds
 * <p>
 * Problem: Equilibrium index of an array is an index such that the sum of elements at lower indexes is
 * equal to the sum of elements at higher indexes.
 * <p>
 * Example:
 * Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
 * Output: 3
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */

public class EquilibirumIndex {

    public static void main(String []args) {

        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " +
                equilibrium(arr, arr_size));
    }

   static int equilibrium(int arr[], int n) {

        int sum = 0; // whole arraysum
        int leftSum = 0;

        for (int i = 0; i < n; ++i) {
            leftSum += arr[i];
        }
        for (int j = 0; j < n; j++) {
            sum -= arr[j];

            if (leftSum == sum)
                return j;

           // leftSum += arr[j];
        }
        return -1;
    }
}
