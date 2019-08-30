package practice;

/**
 * @author AjayDeepakSrinivasan on 29-08-2019, 11:08
 * @project Algos&Ds
 */
public class MathFunctions {

    // find out multiples
    public static void main(String[] args) {

        int arr[] = { 5, 2, 6 ,9, 10, 14, 7, 8};
        int k = 3;
        int kMultiples = 0 ;
        for (int i = 0; i < arr.length; i += k) {
            kMultiples = Math.min(i + k -1, arr.length -1);
        }

        System.out.println(kMultiples);

    }
}
