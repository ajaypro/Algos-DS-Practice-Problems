package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author AjayDeepakSrinivasan on 29-08-2019, 12:27
 * @project Algos&Ds
 */
public class ReverseArrayGroup2 {


    private static void ReverseArray(int[] arr, int size, int k) {
        for (int i = 0; i < size; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, size - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ReverseArrayGroup2 res = new ReverseArrayGroup2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            //something wrong here
            //  int size = Integer.parseInt(br.readLine());
            //  int k=Integer.parseInt(br.readLine());

            //errors here
            String[] integersInString = br.readLine().split(" ");
            int a[] = new int[integersInString.length];
            for (int i = 0; i < integersInString.length; i++) {
                a[i] = Integer.parseInt(integersInString[i]);
            }

            int size = a[0];
            int k = a[1];


            //testing haha
            int[] arr = new int[size];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            ReverseArray(arr, size, k);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sb.append(arr[i] + " ");
            }
            System.out.println(sb);
        }
        br.close();
    }
}


