import java.util.Arrays;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        int freq[] = new int[100001], res = 0;
        for(int i = 0; i < costs.length; ++i){
            ++freq[costs[i]];
        }
        for(int i = 0; i < 100001 && coins >= i; ++i){
            while(coins >= i && freq[i] > 0){
                coins -= i;
                --freq[i];
                ++res;
            }
        }
        
        //return res;
       
        Arrays.sort(costs);
        int counter=0;
        for (int i = 0; i < costs.length; i++) {
            coins-=costs[i];
            System.out.println(coins+" "+costs[i]);
            if(coins==0) {counter++; break; };
            if(coins<0) break;
            counter++;
        }
        return counter;
    }
}
