public class FindeFirstAndLastElementinSortedArray {
  public static void main(String[] args) {
    int[]nums={5,7,7,8,8,10};
    int target = 8;
    searchRange(nums, target);
  }
  
    public static int[] searchRangefail(int[] nums, int target) {
    int beg=0;int end=nums.length-1;
   if(nums.length==1)
   if(target==nums[nums.length-1])
   return new int[]{0,0};
   else
   return new int[]{-1,-1};
    int i=-1,j=-1;
    while(beg<=end)
    {
        int mid=beg+(end-beg)/2;
        if(target==nums[mid]) {i=j=mid;}
        if(target>nums[mid]) beg=mid+1;
        else end=mid-1;
    }
    if(i==-1)
    return new int[]{-1,-1};
    while(i>=0&&j<nums.length-1 &&nums[i]==target&&nums[j]==target )
    {
        if(nums[i]==target)
        i--;
        if(nums[j]==target)
        j++;
    }
    System.out.println(i+j);
    return new int[]{i,j};
    
    }


    private static int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(target > nums[mid]) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
    public static int[] searchRange(int[] nums, int target) {
        int lo = search(nums, target), hi = search(nums, target + 1) - 1;
        if(lo > hi) return new int[]{-1, -1};
        return new int[]{lo, hi};
    }
}
