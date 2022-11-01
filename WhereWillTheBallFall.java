public class WhereWillTheBallFall {
    public int poz=-1;
    public int[] findBall(int[][] grid) {
       int []a=new int[grid[0].length];
       if(grid.length==1&&grid[0].length==1)
       return new int[]{-1};
       
        for (int i = 0; i < grid[0].length; i++) {
        poz=-1;
        dfs(grid, 0, i);
            a[i]=poz;
        }    
        return a;
    }

    public void dfs(int [][]grid,int i,int j)
    {
         if(i==grid.length)
            {
                if(j<grid[0].length)
                    poz=j;
            }

        if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length)
        {   
            if(j!=grid[0].length-1&&grid[i][j]==1&&grid[i][j]!=grid[i][j+1])
            return;
            else
            if(j!=0&&grid[i][j]==-1&&grid[i][j]!=grid[i][j-1])
            return;
            else
            {
            if(grid[i][j]==1)
            dfs(grid, i+1, j+1);
            else
            dfs(grid, i+1, j-1);
            }
           
        }
    }

}
