import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
    public int count;
    boolean ok=false;
    public List<String> findWords(char[][] board, String[] words) {
        List<String> fin =new ArrayList<>();
       List<String>lis=new ArrayList<>();
       for (String string : words) {
        lis.add(string);
       }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                List<String>listtt=new ArrayList<>();
                for (var cs : lis) {
                        count=0;
                        ok=false;
                        boolean[][]b=new boolean[board.length][board[0].length];
                    
                        if(cs.charAt(0)==board[i][j])
                        dfs(board, i, j, cs, b);  
                        if(ok) 
                        {
                            fin.add(cs);
                            
                        }
                        else
                        listtt.add(cs);
                    
                }
                lis=listtt;
                if(lis.isEmpty())
                break;
            }
            if(lis.size()<1)
            break;
        }
       
        return fin;
    }

   public int c;
    public void dfs(char[][]board,int i,int j,String s,boolean[][]b)
    {
        
        if(s=="")
        ok=true;
        if(s.length()>0)
        if(i>=0&&j>=0&&i<board.length&&j<board[0].length&&s.charAt(0)==board[i][j]&&!b[i][j])
        {
            System.out.println(s);
            s=s.substring(1);
            count++;           
            b[i][j]=true;
            dfs(board, i, j+1, s, b);
            dfs(board, i, j-1, s, b);
            dfs(board, i+1, j, s, b);
            dfs(board, i-1, j, s, b);

        }
        

    }
//[["a","b","c"],
///["a","e","d"],
///["a","f","g"]]
}
