import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Sum3 {
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>fin=new LinkedList<>();
        HashMap<Integer,Boolean> man=new HashMap<>();
        for (int list : nums) {
             man.put(list, false);
        }
        for (int i = 0; i < nums.length; i++) {
            Map<Integer,Integer>mp=new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
                if(!mp.containsKey(nums[j]))
                {
                    mp.put(-nums[i]-nums[j], nums[j]);
                   
                }
                else 
                {
                    
                    List<Integer> lis=new LinkedList<>();
                    lis.add(nums[i]);
                    lis.add(mp.get(nums[j]));
                    lis.add(nums[j]);
                    if(!man.get(nums[i])||!man.get(nums[j])||!man.get(mp.get(nums[j])))
                    fin.add(lis);
                    man.put(nums[i], true);
                    man.put(nums[j], true);
                    man.put(mp.get(nums[j]), true);
                    break;
                }
            }

// target --1->1 
// then at -1 mp 2
//at 0 m=2,1
// at 1m=2,1,0
//at 2 found  -1 2 -1
                
        }
        return fin;
    }
}
