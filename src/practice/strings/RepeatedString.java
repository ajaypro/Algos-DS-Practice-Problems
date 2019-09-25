package practice.strings;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AjayDeepakSrinivasan on 07-09-2019, 12:23
 * @project Algos&Ds
 *
 * Problem:
 *   Find the string that is repeating only second time in the sequence. there can be only one string occuring twice in the sequence.
 *
 * give the input as length of string and next item the string itself.
 */
public class RepeatedString {

    public static void main(String[] args) throws IOException {
//code

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int l = 1; l <= t; l++) {
            //int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split("\\s+");

            HashMap<String, Integer> map = new HashMap<>();
            int count = 1;
            for (int i = 0; i < str.length; i++) {
                if (!map.containsKey(str[i])) {
                    map.put(str[i], count);
                } else {
                    map.put(str[i], map.get(str[i])+1);
                }
            }
            String repeatedString = null;
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue().equals(2)) {
                    repeatedString = entry.getKey().toString();
                }
            }
            System.out.println("Second Repeated value : " + repeatedString);
        }
        br.close();
    }
}
