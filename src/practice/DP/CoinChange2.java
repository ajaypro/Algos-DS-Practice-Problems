package practice.DP;

/**
 * @author AjayDeepakSrinivasan on 10-09-2019, 13:20
 * @project Algos&Ds
 */
public class CoinChange2 {

    public static int amount = 4;
    public static int[] coins = {1,2};

    public static void main(String []args){

        System.out.println(combo(4,0));
    }
    public static int combo(int amount, int currentCoin){
        if(amount == 0){
            return 1;
        }

        if(amount < 0){
            return 0;
        }
        int nCombo = 0 ;
        for(int coin = currentCoin; coin < coins.length; coin++) {
             nCombo += combo(amount - coins[coin], coin);
         }

        return nCombo;
    }
}
