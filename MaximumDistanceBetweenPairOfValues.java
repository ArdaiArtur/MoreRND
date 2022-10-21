

public class MaximumDistanceBetweenPairOfValues {
    public int maxDistances(int[] nums1, int[] nums2) {
        int i=0,j=0,max=0;
         while (i<nums1.length&&j<nums2.length) {
             if(nums1[i]<=nums2[j])
             { max= Math.max(max, j-i);
                 j++;
             }
             else
             {
                 i++;
                 
             }
           
         }
     return max;
     }
   
   
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            int r = nums2.length - 1;
            int l = i;
            int m = i;
            while (l <= r) {
                m = l + (r - l) / 2;
                if (nums1[i] > nums2[m]) {
                    r = m - 1;
                } else if (nums1[i] == nums2[m]) {
                    l = m + 1;
                } else {
                    l = m + 1;
                }
            }
            if (r < 0) {
                continue;
            }
            max = Math.max(max, r - i);
        }
        return max;
    }
}
