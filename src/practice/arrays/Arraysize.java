package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author AjayDeepakSrinivasan on 04-09-2019, 13:26
 * @project Algos&Ds
 */
public class Arraysize {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int arrsize = scn.nextInt();
            int[] arr = new int[arrsize];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scn.nextInt();
                System.out.println(arr[i]);
            }

        }
    }
}
