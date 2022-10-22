import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumWindowSubstring {
   
   
    public static void main(String[] args) {
        String  s = "aaaaaaaaaaaabbbbbcdd", t = "abcdd";
       System.out.println( minWindow(s, t));
    }


    public static String minWindow(String s, String t) {
             if(s.equals(t)) return t;
        
        HashMap<Character,Integer>hm=new HashMap<>();
             for (var iterable_element : t.toCharArray()) {
                hm.put(iterable_element, hm.getOrDefault(iterable_element, 0)+1);
             }   
             PriorityQueue<String>pq=new PriorityQueue<>();   


             List<String>lis=new ArrayList<>();
             for (int i = 0; i < s.length(); i++) {
                HashMap<Character,Integer>cop=new HashMap<>();
                StringBuilder sb=new StringBuilder();
                if(hm.containsKey(s.charAt(i)))
                {
                    
                    
                    int j=i;
                    while (j<s.length()&&!cop.equals(hm)) {
                        sb.append(s.charAt(j));
                        if(hm.containsKey(s.charAt(j)))
                        cop.put(s.charAt(j), cop.getOrDefault(s.charAt(j), 0)+1);
                        j++;
                    }
                    if(cop.keySet().equals(hm.keySet()))
                    {

                       lis.add(sb.toString());
                       if(pq.size()>0)
                       {
                        if(pq.peek().length()>t.length())
                        if(pq.peek().length()>sb.length())
                        {
                            pq.poll();
                            pq.add(sb.toString());
                        }
                       }
                       else 
                       pq.add(sb.toString());
                    }
                    
                }

             }
             
            for (String string : lis) {
                System.out.println(string);
            }
             if(pq.isEmpty()&&pq.peek().length()<t.length()) return "";
             return pq.isEmpty()? "" : pq.poll();
            // return lis.isEmpty()? "":lis.get(lis.size()-1);
    }
}
