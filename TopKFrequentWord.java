import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * TopKFrequentWord
 */
public class TopKFrequentWord {
    public List<String> topKFrequent(String[] words, int k) {
      
        HashMap<String,Integer>hm=new HashMap<>();
        for (String string : words) {
            hm.put(string,hm.getOrDefault(string, 0)+1);
        }
        List<String>fin=new ArrayList<>(hm.keySet());
      
        Collections.sort(fin, (w1, w2) -> hm.get(w1).equals(hm.get(w2)) ?
        w1.compareTo(w2) : hm.get(w2) - hm.get(w1));
        return fin.subList(0, k);
    }
    
}