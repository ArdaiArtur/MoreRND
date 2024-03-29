import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class LongestIncreasingSubsequence {
   
   public static void main(String[] args) {
    

   }
   
   
    public static int lengthOfLISxfxfx(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int max=0;
        st.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(  !st.contains(nums[i]))
            {
            while(!st.empty() && st.peek()>nums[i])
            { System.out.println(st.peek());
                st.pop();
               
            }
         
            st.add(nums[i]);
            }
            max=Math.max(st.size(), max);
        }
        return max;
    }
    public  int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(nums[0]);
        for(int i = 1; i < n; i++){
            if(nums[i] > al.get(al.size() - 1))
                al.add(nums[i]);
            else {
                int index = Collections.binarySearch(al,nums[i]);
                if(index < 0){
                    index = Math.abs(index)-1;
                }
                al.set(index,nums[i]);
            }
        }
        printLCS(nums);
        return al.size();
    }
    private Vector<Integer> largestDivisibleSubset;
    private void printLCS(int[] nums){
        int n = nums.length, maxValue = 1, lastIndex = 0;
        int[] parent = new int[n], dp = new int[n];
        
         for(int i = 0; i < n; i++){
             dp[i] = 1;
             parent[i] = i;
             for(int j = 0; j < i; j++){
                 if(nums[j] < nums[i] && dp[j] + 1 > dp[i]){
                     dp[i] = dp[j] + 1;
                     parent[i] = j;
                     if(dp[i] > maxValue){
                         maxValue = dp[i];
                         lastIndex = i;
                     }
                 }
            }
        }
        
        //Now using Stop Index back track and get the result in reverse fashion.
        largestDivisibleSubset.add(0, nums[lastIndex]);
        while(parent[lastIndex] != lastIndex){
            lastIndex = parent[lastIndex];
            largestDivisibleSubset.add(0, nums[lastIndex]);
        }
        System.out.println();
    }   
}
