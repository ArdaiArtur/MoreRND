import java.util.HashMap;

/**
 * SumOfEvryNumvberAfterQueries
 */
public class SumOfEvryNumvberAfterQueries {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            hm.put(i, nums[i]);
        }
        
        int[] fin=new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            int a=queries[i][0];
            int b=queries[i][1];
            int sum=0;
        for (Integer key : hm.keySet()) {
            if(key==b)
            {
                hm.put(key, hm.get(key)+a);
                if(hm.get(key)%2==0)
                sum+=hm.get(key);
            }
            else
            if(hm.get(key)%2==0)
            sum+=hm.get(key);
            }        
            fin[i]=sum;
        }
        
        return fin;
    }
}