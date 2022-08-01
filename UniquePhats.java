public class UniquePhats {
    
    public int uniquePaths(int m, int n)
    {
        int dp[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
            dp[i][0]=1;
        
        for(int i=0;i<n;i++)
            dp[0][i]=1;
        //we filled up the matrix
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1]; //we calculat at each point how many steps it takes to get there
            }
        }
       //basicli its like this
       //1 1 1 1
       //1 1 1 1 original matrix
       //and we calculat how many steps we nead to move to 1,1 then 1,2 then 1,3
       //so we get 1 1 1 1
       //          1 2 3 4
       //this works because ew can only move down and right
       //if we could move at any space at any time withput dubeling then we would nead bool[][] to memorasi all phats in 1 go idk how i would resolve that problem 
        return dp[m-1][n-1];
    }
}
