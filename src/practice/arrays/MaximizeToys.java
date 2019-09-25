package practice.arrays;

import java.util.Arrays;

/**
 * @author AjayDeepakSrinivasan on 13-09-2019, 13:08
 * @project Algos&Ds
 * <p>
 * Maximise the number of toys that can be purchased with amount K
 * <p>
 * Given an array consisting of cost of toys. Given an integer K depicting the amount of money available to purchase toys.
 * Write a program to find the maximum number of toys one can buy with the amount K.
 * <p>
 * Note: One can buy only 1 quantity of a particular toy.
 * <p>
 * Examples :
 * <p>
 * Input:  N = 10, K =  50
 * cost = { 1, 12, 5, 111, 200, 1000, 10, 9, 12, 15 }
 * Output: 6
 * Explanation: Toys with amount 1, 5, 9, 10, 12, and 12
 * can be purchased resulting in a total amount of 49. Hence,
 * maximum number of toys is 6.
 * <p>
 * Input: N = 7, K = 50
 * cost = { 1, 12, 5, 111, 200, 1000, 10 }
 * Output: 4
 */

public class MaximizeToys {

    public static void main(String[] args) {
        int arr[] = {1, 12, 5, 111, 200, 1000, 10, 9, 12, 15};
        int k = 50;
        Arrays.sort(arr);
        int result[] = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum +arr[i] <= k) {
                sum += arr[i];
                result[i] = arr[i];

                System.out.println(result[i]);
            }
        }
        /*for (int items : result) {
            System.out.println(items);
        }*/
    }


}
