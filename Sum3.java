import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sum3 {
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSumfail(int[] nums) {
        List<List<Integer>>fin=new LinkedList<>();
        HashMap<Integer,Boolean> man=new HashMap<>();
        for (int list : nums) {
             man.put(list, false);
        }
        for (int i = 0; i < nums.length; i++) {
            Map<Integer,Integer>mp=new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
               if(nums[i]!=nums[j] || nums.length<4||nums[i]==0)
                if(!mp.containsKey(nums[j]))
                {
                    mp.put(-nums[i]-nums[j], nums[j]);
                   
                }
                else if(i!=j)
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


        }
        return fin;
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                if (nums[i] + nums[start] + nums[end] == 0) {
                    s.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                } else if (nums[i] + nums[start] + nums[end] > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return new ArrayList<>(s);
    }
}
