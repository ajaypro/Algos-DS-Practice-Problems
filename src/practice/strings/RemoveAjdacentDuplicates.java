package practice.strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author AjayDeepakSrinivasan on 18-09-2019, 10:57
 * @project Algos&Ds
 *
 * Problem :
 * Given a string, recursively remove adjacent duplicate characters from the string.
 * The output string should not have any adjacent duplicates
 */

public class RemoveAjdacentDuplicates {

    public static void main(String []args){
        String str = "azxxzy";
        System.out.println(remove(str));
    }

    static String removeDuplicates(String str, char last_removed){

        if(str.length() == 0 || str.length() ==1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            last_removed = str.charAt(0);

            while (str.length() > 1 && str.charAt(0) == str.charAt(1)){
                str = str.substring(1,str.length());
            }
            str = str.substring(1, str.length());
            return removeDuplicates(str, last_removed);
        }
        String remString = removeDuplicates(str.substring(1, str.length()), last_removed);

        // Check if the first character of the rem_string matches with
        // the first character of the original string
        if (remString.length() != 0 && remString.charAt(0) == str.charAt(0))
        {
            last_removed = str.charAt(0);
            return remString.substring(1,remString.length()); // Remove first character
        }

        if (remString.length() == 0 && last_removed == str.charAt(0))
            return remString;

        // If the two first characters of str and rem_str don't match,
        // append first character of str before the first character of
        // rem_str
        return (str.charAt(0) + remString);
    }

    static String remove(String str)
    {
        char last_removed = '\0';
        return removeDuplicates(str, last_removed);
    }

    /*static void removeDuplicates(String str){

        HashSet<String> hashSet = new HashSet<>();
        for(char chars: str.toCharArray()){
            hashSet.add(String.valueOf(chars));
        }
        hashSet.forEach(set -> System.out.println(set));

    }*/
}
