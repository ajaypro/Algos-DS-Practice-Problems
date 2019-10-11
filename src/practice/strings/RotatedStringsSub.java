package practice.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author AjayDeepakSrinivasan on 04-10-2019, 09:42
 * @project Algos&Ds
 */
public class RotatedStringsSub {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {

            String str1 = br.readLine();
            String str2 = br.readLine();

            int rotated;

            if (str1.length() != str2.length()) {
                System.out.println("String1 cannot be obtained from string2");
            }

            String clockRotation = "";
            String anitclockRotation = "";
            int length = str2.length();

            anitclockRotation += str2.substring(length - 2, length) +
                    str2.substring(0, length - 2);
            clockRotation += str2.substring(2) +
                    str2.substring(0, 2);

            if (str1.equals(clockRotation) || str1.equals(anitclockRotation)) {
                rotated = 1;
            } else {
                rotated = 0;
            }

            System.out.println(rotated);
        }
    }
}
