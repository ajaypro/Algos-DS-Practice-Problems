package practice.DP;

import java.util.Scanner;

/**
 * @author AjayDeepakSrinivasan on 17-09-2019, 13:26
 * @project Algos&Ds
 */

public class LargestNumberSum {

   /* static void findLargest(int m, int s){


        // If sum of digits is 0, then a number is possible
        // only if number of digits is 1
        if (s == 0)
        {
            System.out.print(m == 1 ? "Largest number is 0" : "Not possible");

            return ;
        }

        // Sum greater than the maximum possible sum
        if (s > 9*m)
        {
            System.out.println("Not possible");
            return ;
        }

        // Create an array to store digits of result
        int[] res = new int[m];

        // Fill from most significant digit to least
        // significant digit
        for (int i=0; i<m; i++)
        {
            // Fill 9 first to make the number largest
            if (s >= 9)
            {
                res[i] = 9;
                s -= 9;
            }

            // If remaining sum becomes less than 9, then
            // fill the remaining sum
            else
            {
                res[i] = s;
                s = 0;
            }
        }

        System.out.print("Largest number is ");
        for (int i=0; i<m; i++)
            System.out.print(res[i]);
    }*/

    public static void main(String[] args) {
        //int s = 20, m = 3;
        //findLargest(m, s);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int digits, sum;
            digits = sc.nextInt();
            sum = sc.nextInt();
            int arr[] = new int[digits];
            int count = 0;
            if (sum == 0)
                System.out.println(-1);
            else if (sum > 9 * digits)
                System.out.println(-1);
            else {
                for (int i = 0; i < digits; i++) {
                    if (sum >= 9) {
                        arr[i] = 9;
                        sum -= 9;
                        count++;
                    } else {
                        arr[i] = sum;
                        sum -= sum;
                        count++;
                    }
                }
                if (count == digits) {
                    for (int i = 0; i < digits; i++)
                        System.out.print(arr[i]);

                    System.out.println();
                } else
                    System.out.println(-1);
            }
        }
    }
}
