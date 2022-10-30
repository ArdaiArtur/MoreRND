public class ShortestPathInAGridObstaclesElimination {
    public int count=Integer.MAX_VALUE;
    public int shortestPath(int[][] grid, int k) {
       if(grid[grid.length-2][grid[1].length-1]==1)
       {
        grid[grid.length-2][grid[1].length-1]=0;
        k--;
       }
       else if(grid[grid.length-1][grid[1].length-2]==1)
       {
        grid[grid.length-2][grid[1].length-1]=0;
        k--;
       }
        int [][] myInt = new int[grid.length][];
        for(int i = 0; i < grid.length; i++)
            myInt[i] = grid[i].clone();
       
        dfs(grid, 0, 0, k, 0);
        return count==Integer.MAX_VALUE?-1:count;        
    }
//[0,1,0,0,0,1,0,0],
//[0,1,0,1,0,1,0,1],
//[0,0,0,1,0,0,1,0]]

    public void dfs(int [][]grid,int i,int j,int k,int movecounter)
    {System.out.println(movecounter+" "+i+" "+j+" "+k);
    System.out.println("------------------------ ");
    for (int[] ls : grid) {
        for (int ls2 : ls) {
            System.out.print(ls2+" ");
        }
        System.out.println();
    } System.out.println("------------------------ ");

        if(i==grid.length-1&&j==grid[0].length-1)
        {
            count=Math.min(count, movecounter);
            return;
        }
        
        if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length)
        {
            int[][]grid2=grid;
            if(grid[i][j]==0)
            {
                grid[i][j]=2;
                dfs(grid, i+1, j, k,movecounter+1);
                dfs(grid2, i, j+1, k,movecounter+1);
                dfs(grid, i-1, j, k,movecounter+1);
                dfs(grid2, i, j-1, k,movecounter+1);
            }
            else if(grid[i][j]==1&&k>0)
            {
                k--;
                grid[i][j]=2;
                dfs(grid, i+1, j, k,movecounter+1);
                dfs(grid2, i, j+1, k,movecounter+1);
                dfs(grid, i-1, j, k,movecounter+1);
                dfs(grid2, i, j-1, k,movecounter+1);
            }


        }

    }

}
