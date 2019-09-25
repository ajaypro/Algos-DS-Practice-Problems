package practice.strings;

import practice.util.CustomInput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/**
 * @author AjayDeepakSrinivasan on 07-09-2019, 11:05
 * @project Algos&Ds
 *
 * Problem:
 *  Find the string that is repeating only second time in the sequence. there can be only one string occuring twice in the sequence.
 */
public class RepeatingStrings {

    public static void main(String[] args) {
        String s1[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        String str[] = CustomInput.str;

        repeatedString(str);
    }

    private static void repeatedString(String str[]) {


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


   /* static String secMostRepeated(Vector<String> seq)
    {
        // Store all the words with its occurrence
        HashMap<String, Integer> occ = new HashMap<String,Integer>(seq.size()){
            @Override
            public Integer get(Object key) {
                return containsKey(key) ? super.get(key) : 0;
            }
        };

        for (int i = 0; i < seq.size(); i++)
            occ.put(seq.get(i), occ.get(seq.get(i))+1);

        // find the second largest occurrence
        int first_max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;

        Iterator<Map.Entry<String, Integer>> itr = occ.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            int v = entry.getValue();
            if( v > first_max) {
                sec_max = first_max;
                first_max = v;
            }

            else if (v > sec_max &&
                    v != first_max)
                sec_max = v;
        }

        // Return string with occurrence equals
        // to sec_max
        itr = occ.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            int v = entry.getValue();
            if (v == sec_max)
                return entry.getKey();
        }

        return null;
    }*/
}

