import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindePlayersWithZeroOrOneLoss {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for (int[] is : matches) {
            if(!hs.containsKey(is[0]))
                hs.put(is[0], 0);

                if(!hs.containsKey(is[1]))
                hs.put(is[1], 1);
                else
                hs.put(is[1], hs.get(is[1])+1);
        }
        List<Integer>zero=new ArrayList<>();
        List<Integer>one=new ArrayList<>();
        for (var ma: hs.keySet()) {
            if(hs.get(ma)==0)
            zero.add(ma);
            else if(hs.get(ma)==1)
            one.add(ma);
        }
        List<List<Integer>>fin=new ArrayList<>();
        fin.add(zero);
        fin.add(one);
        Collections.sort(fin.get(0));
        Collections.sort(fin.get(1));
        return fin;
    }
}
