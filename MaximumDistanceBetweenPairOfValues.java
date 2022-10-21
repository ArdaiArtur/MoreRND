import java.lang.annotation.Retention;

public class MaximumDistanceBetweenPairOfValues {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0,max=0;
        while (i<nums1.length&&j<nums2.length) {
            if(nums1[i]<=nums2[j])
            {
                j++;
            }
            else
            {
                i++;
                j=i;
            }
           max= Math.max(max, j-i);
        }
        
    return max==0?max:max-1;
    }
    
}
