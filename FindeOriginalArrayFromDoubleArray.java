import java.util.Arrays;
import java.util.HashMap;

public class FindeOriginalArrayFromDoubleArray {
    public int[] findOriginalArray(int[] changed) {
       int n=changed.length;
       if(n%2!=0) return new int [0];
       
        HashMap<Integer,Integer>hm=new HashMap<>();
        Arrays.sort(changed);
        for (int i = 0; i < n; i++) {
          hm.put(changed[i],hm.getOrDefault(changed[i],0)+1);
        }
        int[] fin=new int [n/2];
        int pointer=0;

        for (int i = 0; i < n; i++) {
            if(hm.get(changed[i])<1) continue;
            if(hm.getOrDefault(changed[i]*2,0 )<1) return new int [0];
            hm.put(changed[i], hm.get(changed[i])-1);
            hm.put(changed[i]*2, hm.get(changed[i]*2)-1);
            fin[pointer++]=changed[i];
        }
        return fin;
    }
}
