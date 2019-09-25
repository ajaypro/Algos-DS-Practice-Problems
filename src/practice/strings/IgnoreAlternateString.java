package practice.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;


/**
 * @author AjayDeepakSrinivasan on 09-09-2019, 12:44
 * @project Algos&Ds
 * <p>
 * Problem
 * <p>
 * Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences
 * of any character dropped(including space and consider upper and lowercase as same).
 */

public class IgnoreAlternateString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // no. of test cases
        int testCases = Integer.parseInt(br.readLine());
        for (int l = 1; l <= testCases; l++) {
            //int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            // Convert uppercase to lowercase
            String s = str.toLowerCase();
            char[] chars = s.toCharArray();

            int[] occ = new int[chars.length];

            // Start traversing the string
            for (int i = 0; i < str.length(); i++)
            {
                char temp = s.charAt(i);

                // Increment occurrence count
                occ[temp]++;

                // If count is odd then print the character
                if (occ[temp]%2 != 0)
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }

        }

        /*char[] charArray = str.toCharArray();
        ignoreString(charArray);*/

        //printStringAlternate(str);
    }

    /*private static void ignoreString(char[] charArray){
        Hashtable<Character, Integer> table = new Hashtable<>();
        int count = 1;

        for (int i = 0; i < charArray.length; i++) {

            if (!table.containsKey(charArray[i])) {
                table.put(charArray[i], count);
            }
        }

        table.forEach((k, v) -> System.out.println(k));
    }

    static void printStringAlternate(String str)
    {
        int[] occ = new int[122];

        // Convert uppercase to lowercase
        String s = str.toLowerCase();

        // Start traversing the string
        for (int i = 0; i < str.length(); i++)
        {
            char temp = s.charAt(i);

            // Increment occurrence count
            occ[temp]++;

            // If count is odd then print the character
            if (occ[temp]%2 != 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }*/


