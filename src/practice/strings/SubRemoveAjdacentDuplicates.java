package practice.strings;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author AjayDeepakSrinivasan on 18-09-2019, 12:16
 * @project Algos&Ds
 */
public class SubRemoveAjdacentDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            String s1 = sc.next();
            System.out.println(removeDuplicates(s1));

        }
    }

    static String removeDuplicates(String str) {

        {
            if (str.equals(""))
                return "";

            int i, j, k;
            int n = str.length();

            Stack<Character> s = new Stack<>();
            boolean flag = false;

            for (i = 0; i < n; i++)
                s.push(str.charAt(i));
            str = "";
            char c = s.peek();
            flag = false;
            s.pop();
            int key = 0; //to check if we need to check the answer again
            while (!s.isEmpty()) {
                //cout<<st.top()<<" ";
                if (s.peek() == c) {
                    flag = true;
                    key = 1;
                } else if (s.peek() != c) {
                    if (flag == false)
                        str += c;
                    c = s.peek();
                    flag = false;
                }
                s.pop();
            }
            if (flag == false)
                str += c;
            StringBuilder ss = new StringBuilder(str);
            ss = ss.reverse();
            str = ss.toString();

            if (key == 1)
                str = removeDuplicates(str);
            return str;
        }
    }
}
