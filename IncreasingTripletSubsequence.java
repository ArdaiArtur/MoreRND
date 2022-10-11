public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int j=Integer.MAX_VALUE;
            int k=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            
            
                if(nums[i]>j)
                {
                    j=nums[i];
                }
                else
                {
                    if(nums[i]>k)
                    {
                        k=nums[i];
                    }
                    else
                    {
                        return true;
                    }

                }
               
            }
        
        return false;
    }
}
