import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int j=0;
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            
            if(!hs.contains(nums[i]))
            {
                nums[j]=nums[i];
                j++;
                hs.add(nums[i]);
            }
        }
        return j;
    }
}
