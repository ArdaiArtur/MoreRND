public class SuperUglyNumber {
    public static void main(String[] args) {
        nthSuperUglyNumber(29,new int[] {3,5,7,17,19,23,29,43,47,53});
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        int []man= new int [primes[primes.length-1]+1];
        dp[0] = 1;
     int db=0;
        for (int i = 1; i < n; i++) {
       int minx=1000;
       int sp=0;
       
            for (int ix : primes) {
                if(dp[man[ix]]*ix<minx)
                {
                    sp=ix;
                   
                }
                minx=Math.min(dp[man[ix]]*ix,minx);

            }
            dp[i] = minx;
           int fd=minx;
                while(fd%sp==0)
                {
                    fd=fd/sp;
                } 
               
            if(man[fd]!=0&&db>man[fd])
            { 
                
                man[fd]++; 
                System.out.print(fd+" ");
            }
            man[sp]++; System.out.print(sp+" ");
            System.out.println(dp[i]+" ");
            db++;
        }
        
        return dp[n - 1];       
    }
    }


