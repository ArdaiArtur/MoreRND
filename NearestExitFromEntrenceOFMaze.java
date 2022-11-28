public class NearestExitFromEntrenceOFMaze {
    public  int counter=1000;
    public int nearestExit(char[][] maze, int[] entrance) {
        char [][] myInt =  new char [maze.length][];
        for(int i = 0; i < maze.length; i++)
            myInt[i] = maze[i].clone();
       
            char [][] myInt1 =  new char [maze.length][];
            for(int i = 0; i < maze.length; i++)
                myInt1[i] = maze[i].clone();

                char [][] myInt2 =  new char [maze.length][];
                for(int i = 0; i < maze.length; i++)
                    myInt2[i] = maze[i].clone();




        dfs(maze.clone(), entrance[0], entrance[1], 0);
        dfs1(myInt, entrance[0], entrance[1], 0); 
        dfs2(myInt1, entrance[0], entrance[1], 0);
        dfs3(myInt2, entrance[0], entrance[1], 0);

        
        return counter==1000?-1: counter;

    }
    /*
     * 
     * [["+",".",".","+",".",".",".",".",".","+",".","+","+","+","+","+",".",".",".","."],
     * [".","+",".",".",".","+",".","+",".",".","+","+",".",".",".",".",".",".",".","."],
     * [".",".",".",".",".",".",".",".",".","+",".",".",".",".",".","+",".",".",".","+"],
     * ["+",".",".","+",".","+","+","+",".","+",".",".",".",".","+","+",".",".",".","."],[".","+",".",".",".","+",".",".",".","+",".",".","+",".",".",".",".",".",".","."],["+",".","+","+",".",".",".",".",".",".",".",".",".",".","+",".",".","+","+","."],[".",".",".",".","+",".","+","+",".",".",".",".","+","+","+",".",".",".",".","."],[".","+",".",".",".","+",".",".","+",".","+",".",".","+","+",".","+",".",".","+"],[".",".",".",".",".",".",".",".",".",".",".","+","+","+",".",".","+",".",".","."],
     * [".","+","+",".","+",".","+",".","+","+","+",".",".","+","+",".",".","+","+","."],[".",".",".",".",".",".","+","+","+",".",".",".","+",".","+","+","+",".","+","."],
     * [".","+",".","+",".","+",".",".","+",".",".","+","+",".","+",".",".","+",".","."],[".","+",".",".",".","+","+",".",".","+","+","+",".",".",".","+","+","+",".","."],
     * [".",".",".",".",".",".",".","+",".",".","+",".",".","+",".",".","+",".",".","."],[".",".","+","+",".","+",".",".","+",".",".",".",".",".","+",".",".","+",".","."],[".",".","+",".",".","+",".","+","+",".",".",".",".",".",".","+",".",".",".","."],[".",".",".",".",".",".",".",".",".",".","+",".",".",".","+",".",".","+",".","+"],
     * [".",".",".",".","+",".",".",".",".",".","+",".",".",".",".","+",".",".",".","."]]
     */
    int c=0;
    public void dfs(char[][] maze, int i,int j,int count)
    {
        

        if(i>=0&&j>=0&&i<maze.length&&j<maze[0].length&&maze[i][j]!='+')
        {
            if(i==0||j==0||i==maze.length-1||j==maze[0].length-1)
        {
            
            if(count!=0)
            {System.out.println(count);
            counter=Math.min(counter, count);
            return;
            }
        }
          //  System.out.println(i+" "+j+" count"+count);
            maze[i][j]='+';
             dfs(maze, i, j+1,count+1);
            dfs(maze, i+1, j,count+1);
            dfs(maze, i, j-1,count+1);
            
             dfs(maze, i-1, j,count+1);
           
            
           if(c<1)
           {
            maze[i][j]='.';
        c++;   
        }

        }
    }
    public void dfs1(char[][] maze, int i,int j,int count)
    {
        

        if(i>=0&&j>=0&&i<maze.length&&j<maze[0].length&&maze[i][j]!='+')
        {
            if(i==0||j==0||i==maze.length-1||j==maze[0].length-1)
        {
            
            if(count!=0)
            {System.out.println(count);
            counter=Math.min(counter, count);
            return;
            }
        }
          //  System.out.println(i+" "+j+" count"+count);
            maze[i][j]='+';
             dfs1(maze, i, j+1,count+1);
             
            dfs1(maze, i+1, j,count+1);
            dfs1(maze, i-1, j,count+1);
            dfs1(maze, i, j-1,count+1);
            
            
           
           if(c<1)
           {
            maze[i][j]='.';
        c++;   
        }

        }
    }
    public void dfs2(char[][] maze, int i,int j,int count)
    {
        

        if(i>=0&&j>=0&&i<maze.length&&j<maze[0].length&&maze[i][j]!='+')
        {
            if(i==0||j==0||i==maze.length-1||j==maze[0].length-1)
        {
            
            if(count!=0)
            {System.out.println(count);
            counter=Math.min(counter, count);
            return;
            }
        }
          //  System.out.println(i+" "+j+" count"+count);
            maze[i][j]='+';
             dfs2(maze, i-1, j,count+1);
            dfs2(maze, i+1, j,count+1);
            dfs2(maze, i, j+1,count+1);
           
            
            dfs2(maze, i, j-1,count+1);
           if(c<1)
           {
            maze[i][j]='.';
        c++;   
        }

        }
    }
    public void dfs3(char[][] maze, int i,int j,int count)
    {
        

        if(i>=0&&j>=0&&i<maze.length&&j<maze[0].length&&maze[i][j]!='+')
        {
            if(i==0||j==0||i==maze.length-1||j==maze[0].length-1)
        {
            
            if(count!=0)
            {System.out.println(count);
            counter=Math.min(counter, count);
            return;
            }
        }
          //  System.out.println(i+" "+j+" count"+count);
            maze[i][j]='+';
            dfs(maze, i, j-1,count+1);
              dfs(maze, i-1, j,count+1);
            dfs(maze, i, j+1,count+1);
          
            dfs(maze, i+1, j,count+1);
          
           if(c<1)
           {
            maze[i][j]='.';
        c++;   
        }

        }
    }



}
