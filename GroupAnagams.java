import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
               char[]a=strs[i].toCharArray();
               Arrays.sort(a);
               String s=new String(a);
               if(!hm.containsKey(s))
               {
                hm.put(s, new ArrayList<>());
               }        
               hm.get(s).add(strs[i]);
        }
            
        return new ArrayList<>(hm.values());
        
    }
}
