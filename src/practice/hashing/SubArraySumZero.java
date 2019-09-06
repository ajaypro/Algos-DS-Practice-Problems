package practice.hashing;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @author AjayDeepakSrinivasan on 05-09-2019, 12:17
 * @project Algos&Ds
 *
 * find subarrays who sum is 0
 */
public class SubArraySumZero {

   static  class Pair
    {
        int first, second;
        Pair(int a, int b)
        {
            first = a;
            second = b;
        }
    }

    public static void main(String []args){

        int arr[] = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        ArrayList<Pair>  list = getSubarrays(arr);

        print(list);
    }

    private static ArrayList<Pair> getSubarrays(int arr[]){

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Pair> list = new ArrayList<>();

        int sum = 0;
        for(int i= 0; i < arr.length; i++){
            sum += arr[i];

            if(sum == 0)
                list.add(new Pair(0, i));

            ArrayList<Integer> arrayList = new ArrayList<>();

            if(map.containsKey(sum)){
                arrayList = map.get(sum);

                for(int j =0; j < arrayList.size(); j++){
                    list.add(new Pair(arrayList.get(j)+1, i));
                }
            }
            arrayList.add(i);
            map.put(sum, arrayList);
        }
        return list;
    }

    static void print(ArrayList<Pair> list){

        for(int i = 0; i < list.size(); i++){
            Pair pair = list.get(i);

            System.out.println("Subarray found from Index "
                    + pair.first + " to " + pair.second);
        }
    }
}
