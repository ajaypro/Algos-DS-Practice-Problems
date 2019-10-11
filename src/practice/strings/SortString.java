package practice.strings;

import java.util.Arrays;

/**
 * @author AjayDeepakSrinivasan on 04-10-2019, 10:49
 * @project Algos&Ds
 */
public class SortString {

    public static void main(String []args){

        String inputString = "geeksforgeeks";
        //System.out.println(sortString(inputString));


    }

    static void sortString(String str){

        int arr[] = new int[256];
        char tempArr[] = str.toCharArray();

        Arrays.sort(tempArr);
        int count =0;
        for(int i=0; i< tempArr.length; i++){
            int asciiValue = (int) str.charAt(i);

            if(str.charAt(i) != 0){
                arr[asciiValue] = count+1;
            }

        }
    }

    /*static String sortString(String str){

        char inputStr[] = str.toCharArray();
        Arrays.sort(inputStr);

        return new String(inputStr);

    }*/
}
