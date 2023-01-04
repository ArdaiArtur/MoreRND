import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOcuremces {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer>hs=new HashMap<>();
     for (int i : arr) {
        hs.put(i, hs.getOrDefault(i, 0)+1);
     }   
     HashSet<Integer> se=new HashSet<>(hs.values());
     return se.size()==hs.size();
    }
}
