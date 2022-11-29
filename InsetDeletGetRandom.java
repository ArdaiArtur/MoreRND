import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class InsetDeletGetRandom {
   private HashMap<Integer,Integer>hm;
   private Random rnd;
   private List<Integer>lis;
    public InsetDeletGetRandom() {
        hm=new HashMap<>();
        rnd=new Random();
        lis=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
        return false;
        else
        {
            hm.put(val, lis.size());
            lis.add(val);
            return true;
        }

        
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val))
        {
           int a= hm.remove(val);
            int b=lis.remove(lis.size()-1);
            if(val!=b)
            {
                lis.set(a, b);
                hm.put(b, a);
            }
            return true;
        }
        else
        return false;
    
    }
    
    public int getRandom() {
        return lis.get(rnd.nextInt(lis.size()));
    }

}
