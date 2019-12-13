package practice.strings;

/**
 * @author AjayDeepakSrinivasan on 12-12-2019, 11:43
 * @project Algos&Ds
 */
public class MovingString {



        public static void main(String[] args) {
            String str1 = "QAWABAWONL";
            System.out.println(moveChars(str1));
        }


        static int moveChars(String str) {
            int n = str.length();
            int res = -1;

            for (int i = 0; i < n - 1; i++)
                for (int j = i + 1; j < n; j++)
                    if (str.charAt(i) == str.charAt(j))
                        res = Math.max(res,
                                Math.abs(j - i - 1));

            return res;
        }
    }

