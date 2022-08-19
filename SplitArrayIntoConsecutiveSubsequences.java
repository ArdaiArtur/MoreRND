import java.util.HashSet;

public class SplitArrayIntoConsecutiveSubsequences {
    public boolean isPossible(int[] nums) {
      if(nums.length<3) return false;
        int i=1;
     HashSet<Integer>hs=new HashSet<>();
     int count=0;
     int div=nums.length/3;
     System.out.println(div);
     hs.add(nums[0]);
        while(i<nums.length)
        {
           
           if(nums[i-1]<=nums[i])
           {
            hs.add(nums[i]);
           }
           
            if(hs.size()>=3)
            {hs.clear();
                count++;
            }
           if(count>=div&&hs.size()==0)
           return true;
           i++;

        }
        return false;
    }
}
