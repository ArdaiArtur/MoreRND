import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    public String minWindows(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Dictionary which keeps a count of all the unique characters in t.
        Map<Character, Integer> dictT = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            int count = dictT.getOrDefault(t.charAt(i), 0);
            dictT.put(t.charAt(i), count + 1);
        }

        // Number of unique characters in t, which need to be present in the desired window.
        int required = dictT.size();

        // Left and Right pointer
        int l = 0, r = 0;

        // formed is used to keep track of how many unique characters in t
        // are present in the current window in its desired frequency.
        // e.g. if t is "AABC" then the window must have two A's, one B and one C.
        // Thus formed would be = 3 when all these conditions are met.
        int formed = 0;

        // Dictionary which keeps a count of all the unique characters in the current window.
        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

        // ans list of the form (window length, left, right)
        int[] ans = { -1, 0, 0 };

        while (r < s.length()) {
            // Add one character from the right to the window
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            // If the frequency of the current character added equals to the
            // desired count in t then increment the formed count by 1.
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }
            

            // Try and contract the window till the point where it ceases to be 'desirable'.
            while (l <= r && formed == required) {
                c = s.charAt(l);
                // Save the smallest window until now.
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                // The character at the position pointed by the
                // `Left` pointer is no longer a part of the window.
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }
 System.out.println( s.substring(ans[1], ans[2] + 1));
                // Move the left pointer ahead, this would help to look for a new window.
                l++;
            }
    
            // Keep expanding the window once we are done contracting.
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
