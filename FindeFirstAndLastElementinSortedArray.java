public class FindeFirstAndLastElementinSortedArray {
  public static void main(String[] args) {
    int[]nums={5,7,7,8,8,10};
    int target = 8;
    searchRange(nums, target);
  }
  
    public static int[] searchRange(int[] nums, int target) {
    int beg=0;int end=nums.length-1;
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
    while(nums[i]==target&&nums[j]==target)
    {
        if(nums[i]==target)
        i--;
        if(nums[j]==target)
        j++;
    }
    System.out.println(i+j);
    return new int[]{i,j};
    
    }
}
