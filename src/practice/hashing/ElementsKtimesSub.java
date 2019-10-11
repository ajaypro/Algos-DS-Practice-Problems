package practice.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author AjayDeepakSrinivasan on 27-09-2019, 12:47
 * @project Algos&Ds
 */
public class ElementsKtimesSub {


    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();
        int t = Integer.parseInt(s);

        while (t-- > 0) {
            String s1[] = buff.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            int k = Integer.parseInt(s1[1]);
            int arr[] = new int[n];
            String s2[] = buff.readLine().split(" ");
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(s2[i]);
            Map<Integer, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                if (!hashMap.containsKey(arr[i]))
                    hashMap.put(arr[i], 1);
                else {
                    hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
                }


            }

            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (hashMap.containsValue(k)) {
                    System.out.println(arr[i]);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(-1);
            }


        }
    }
}

