
import java.util.Arrays;


public class Sum3Closet {
    public int threeSumClosest(int[] nums, int target) {
        int count=Integer.MAX_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                if (nums[i] + nums[start] + nums[end] == target) {
                    return target;

                   
                } else if (nums[i] + nums[start] + nums[end] > target) {
                    end--;
                } else {
                    start++;
                }

              
            }
          
            if(Math.abs(count-target) >Math.abs((nums[i] + nums[start] + nums[end])-target))
               if(start+1<nums.length)
               {   count=nums[i] + nums[start] + nums[start+1];
                System.out.println(nums[i]+" " + nums[start]+" " + nums[end]);
               }
            else
                 count=nums[i] + nums[start] + nums[start-1];
        }
        return count;
    }
}
