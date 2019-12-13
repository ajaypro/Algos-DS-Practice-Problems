package practice.strings;

/**
 * @author AjayDeepakSrinivasan on 02-12-2019, 17:53
 * @project Algos&Ds
 * <p>
 * Problem: Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
 * reverse the string in a way that special characters are not affected.
 * <p>
 * Example: Input:   str = "a,b$c"
 * Output:  str = "c,b$a"
 */

public class ReverseString {

    public static void main(String[] args) {
        String str = "Ab,c,de!$";
        char[] chars = str.toCharArray();
        reverseString(chars);
        String strReverse = new String(chars);
        System.out.println(strReverse);

    }

    public static void reverseString(char chars[]) {

        int right = chars.length - 1;
        int left = 0;

        while (left < right) {
            if (!Character.isAlphabetic(chars[left])) { // check if not alphabet from left
                left++;
            } else if (!Character.isAlphabetic(chars[right])) { // check if not alphabet from right
                right--;
            } else {

                // swapping left and right so that we reverse the string
                // e.g   e______A!$
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
    }
}
