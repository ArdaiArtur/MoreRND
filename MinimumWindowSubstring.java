import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
             HashMap<Character,Integer>hm=new HashMap<>();
             for (var iterable_element : t.toCharArray()) {
                hm.put(iterable_element, hm.getOrDefault(iterable_element, 0)+1);
             }   
             List<String>lis=new ArrayList<>();
             for (int i = 0; i < s.length(); i++) {
                HashMap<Character,Integer>cop=new HashMap<>();
                StringBuilder sb=new StringBuilder();
                if(hm.containsKey(s.charAt(i)))
                {
                    cop.put(s.charAt(i), 1);
                    
                    int j=i;
                    while (j<s.length()&&!cop.equals(hm)) {
                        sb.append(s.charAt(j));
                        if(hm.containsKey(s.charAt(i)))
                        cop.put(s.charAt(j), cop.getOrDefault(s.charAt(j), 0)+1);
                        j++;
                    }
                    lis.add(sb.toString());
                }

             }
             lis.sort(null);
             return lis.isEmpty()? "":lis.get(0);
    }
}
