import java.util.PriorityQueue;

public class BreakAPalidrom {
    public String breakPalindrom(String palindrome)
    {
       
        StringBuilder sb=new StringBuilder(palindrome);
            if(palindrome.length()<=1) return "";
            
            
            for (int i = 0; i < palindrome.length()/2; i++) {
                if(sb.charAt(i)>'a') 
                {   
                   // sb.insert(i, pq.poll());
                    sb.replace(i, i+1,"a");
                    return sb.toString();         
                }
            }
            sb.replace(palindrome.length()-2, palindrome.length()-1, "b");
            return sb.toString();


    }
}
