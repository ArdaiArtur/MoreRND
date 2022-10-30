import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInAGridObstaclesElimination {
    public int count=Integer.MAX_VALUE;
    public int shortestPaths(int[][] grid, int k) {
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


    public int shortestPath(int[][] grid, int k) {
        
        int m = grid.length, n = grid[0].length;
        boolean[][][] visited = new boolean[m][n][k + 1];
        
		Queue<int[]> Q = new LinkedList<>(); 
        Q.add(new int[]{0, 0, k});
		//0 index -> x coordinate
		//1 index -> y coordinate
		//2 index -> obstacle count
     
        int res = 0;
        
        while(Q.size() > 0){
            int size = Q.size();
			
            while(size-- > 0){
                
                int[] rem = Q.remove();
                int x = rem[0];
                int y = rem[1];
                int obs = rem[2];
                
                if(x == m - 1 && y == n - 1 && obs >= 0)   return res;     // reached end
                
                if(obs < 0 || visited[x][y][obs] == true)  continue;
                visited[x][y][obs] = true;
                
                // up
                if(x - 1 >= 0){
                    Q.add(new int[]{x - 1, y, obs - grid[x - 1][y]});
                }
    
                // down
                if(x + 1 < m){
                    Q.add(new int[]{x + 1, y, obs - grid[x + 1][y]});
                }
                
                // left
                if(y - 1 >= 0){
                    Q.add(new int[]{x , y - 1, obs - grid[x][y - 1]});
                }
                
                // right
                if(y + 1 < n){
                    Q.add(new int[]{x , y + 1, obs - grid[x][y + 1]});
                }
            }
            ++res;
        }
        return -1;
    }

}
