import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []vnum=new int[1001];
           for (int i : nums1) {
               vnum[i]++;
           }
           int size=0;
           int []rnum= new int[1001];
           for (int i : nums2) {
               if(vnum[i]>0)
               {
                   vnum[i]--;
                   rnum[size++]=i;
               }
           }
           return Arrays.copyOf(rnum, size);
       }
}
