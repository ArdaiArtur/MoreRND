public class Maximun69Number {
    public int maximum69Number (int num) {
        int p=3;
        int n=num;
        int  count=0;
        int i=0;
        while (n!=0) {
            int s=n%10;
            n/=10;
            count++;
            if(s==6)
            i=count;
        }
       for (int j = 0; j < i-1; j++) {
        p*=10;
       }
       return i==0?num: num+p;
    }
}
