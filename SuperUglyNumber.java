public class SuperUglyNumber {
    public static void main(String[] args) {
        nthSuperUglyNumber(5911,new int[] {2,3,5,7});
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        int []man= new int [primes[primes.length-1]+1];
        dp[0] = 1;
     
        for (int i = 1; i < n; i++) {
       int minx=Integer.MAX_VALUE;
       int sp=0;
       
            for (int ix : primes) {
                if(dp[man[ix]]*ix<minx)
                {
                    sp=ix;
                   
                }
                if(dp[man[ix]]*ix>0)
                minx=Math.min(dp[man[ix]]*ix,minx);

            }
            dp[i] = minx;
           int fd=minx;
           for (int ix : primes) {
            if(fd%ix==0)
            {
                man[ix]++;
            while(fd%ix==0)
                {
                    fd=fd/ix;
                } 
            }
            if(fd==1) break;
          
        }
                
               
           
            System.out.print(sp+" ");
            System.out.println(dp[i]+" ");
          
        }
        
        return dp[n - 1];       
    }
    }


