package practice.strings;

/**
 * @author AjayDeepakSrinivasan on 04-10-2019, 08:58
 * @project Algos&Ds
 * Problem : Given two strings a and b. The task is to find if a string 'a' can be obtained by rotating another string 'b' by 2 places
 */

public class RotatedStrings {

    public static void main(String []args){

        String str1 = "amazon";
        String str2 = "azonam";

        int isRotated;

        if(str1.length() != str2.length()){
            System.out.println("String1 cannot be obtained from string2");
        }

        String clockRotation = "";
        String anitclockRotation = "";
        int length= str2.length();

        anitclockRotation += str2.substring(length - 2, length) +
                             str2.substring(0, length - 2);
        clockRotation += str2.substring(2) +
                str2.substring(0,2);

        if(str1.equals(clockRotation) || str1.equals(anitclockRotation)){
            isRotated = 1;
        } else {
            isRotated =0;
        }

        System.out.println(isRotated);
    }
}
