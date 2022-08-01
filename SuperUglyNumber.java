public class SuperUglyNumber {
    public static void main(String[] args) {
        nthSuperUglyNumber(12,new int[] {2,7,13,19});
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        int []man= new int [primes[primes.length-1]+1];
        dp[0] = 1;
     
        for (int i = 1; i < n; i++) {
       int minx=1000;
       int sp=0;
            for (int ix : primes) {
                if(dp[man[ix]]*ix<minx)
                sp=ix;
                minx=Math.min(dp[man[ix]]*ix,minx);

            }
            dp[i] = minx;
            man[sp]++;
        }
        for (int i : dp) {
            System.out.print(i+" ");
        }
        return dp[n - 1];       
    }
    }


