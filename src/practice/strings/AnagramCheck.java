package practice.strings;

/**
 * @author AjayDeepakSrinivasan on 09-10-2019, 11:32
 * @project Algos&Ds
 * Problem : Check if two strings are anagrams of each other.
 * Given two strings S1 and S2 of size m and n respectively, you need to check whether the two strings are an anagram of each other or not.
 * S1 is an anagram of S2 if the characters of S1 can be rearranged to form S2.
 */

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "admirer";
        String str2 = "married";

        System.out.println(checkAnagram(str1, str2));
    }

    static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int value = 0;

        for (int i = 0; i < str1.length(); i++) {

            value = value ^ (int)str1.charAt(i);
            value = value ^ (int)str2.charAt(i);
        }

        return value == 0;
    }
}
