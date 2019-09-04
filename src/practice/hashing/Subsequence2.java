package practice.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author AjayDeepakSrinivasan on 04-09-2019, 13:44
 * @project Algos&Ds
 */
public class Subsequence2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split("\\s+");
            int arr[] = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            int ans = 0;

            for (int i = 0; i < arr.length; i++) {
                hashSet.add(arr[i]);
            }
            for (int i = 0; i < arr.length; i++) {
                if (!hashSet.contains(arr[i] - 1)) {
                    int j = arr[i];
                    while (hashSet.contains(j)) {
                        j++;
                    }
                    if (ans < j - arr[i])
                        ans = j - arr[i];
                }
            }
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
}


