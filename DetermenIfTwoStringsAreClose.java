import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DetermenIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer>hm1=new HashMap<>();
        for (var i : word1.toCharArray()) {
            hm1.put(i, hm1.getOrDefault(i,0)+1);
        }
        HashMap<Character,Integer>hm2=new HashMap<>();
        for (var i : word2.toCharArray()) {
            hm2.put(i, hm2.getOrDefault(i,0)+1);
        }
       if(!hm1.keySet().equals(hm2.keySet())) return false;
        List<Integer>l1=new ArrayList<>(hm1.values());
        List<Integer>l2=new ArrayList<>(hm2.values());
        l1.sort(null);
        l2.sort(null);
        //return hs1.containsAll(hs2) && hs2.containsAll(hs1) && hm1.keySet().containsAll(hm2.keySet()) &&hm2.keySet().containsAll(hm1.keySet());
        return l1.equals(l2);
      //  return hs1.equals(hs2)&&hm1.keySet().equals(hm2.keySet())&& hs2.equals(hs1)&&hm2.keySet().equals(hm1.keySet()); 
     }
}
