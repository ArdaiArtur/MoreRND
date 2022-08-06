public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int a=minutesToTest/minutesToDie;
       int i=0;
       while(Math.pow(a+1, i)<buckets)
       {
        i++;
       }
       return i;
    }
}
