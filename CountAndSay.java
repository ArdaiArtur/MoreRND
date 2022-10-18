import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    public String countAndSay(int n) {
    if(n==1) return "1";
     String s="1";
        for (int i = 0; i < n; i++) {
            s=helps(s);
        }
        return s;
    }

    public  String  helps(String a)
    {
        StringBuilder sb=new StringBuilder();
        int count=1;
        char prev=a.charAt(0);
     
       for (int i = 1; i < a.length(); i++) {
            if(prev==a.charAt(i))
            {count++;
              
            }
            else
            {
                sb.append(count);
               sb.append(prev);
                prev=a.charAt(i); 
                count=1; 
            }
           
        }
        sb.append(count);
        sb.append(prev);
        return sb.toString();

    }
    public String help(List<int[]>a)
    {
        StringBuilder sb=new StringBuilder();
        for (var t : a) {
            sb.append(t[0]);
            sb.append(t[1]);
        }
        return sb.toString();
    }
}
