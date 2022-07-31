import java.util.Arrays;

public class MinimumAmiuntOfTimeToFillCups {
    public static void main(String[] args) {
        
    }
    public int fillCups(int[] amount) {
        int sec=0;
       Arrays.sort(amount);
       if(amount[0]+amount[1]<amount[2])
       {
        sec=amount[2];
       }
       else
       {
        sec=(amount[0]+amount[1]+amount[2])/2;
        if(sec%2!=0) sec=(sec+1)/2;
        else
        sec=sec/2;
       }
       return sec;
    }
}
