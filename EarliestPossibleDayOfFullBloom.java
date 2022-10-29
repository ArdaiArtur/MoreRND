/**
 * EarliestPossibleDayOfFullBloom
 */
public class EarliestPossibleDayOfFullBloom {

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int a=0,b=0;
        for (int i : growTime) {
            b+=i;
        }
        for (int i : plantTime) {
            a+=i;
        }

        return b>a?a+1+(b-a):a+1;
    }
}