import java.util.Stack;

public class LongestIncreasingSubsequence {
   
   public static void main(String[] args) {
    int [] nums=new int[]{10,9,2,5,3,7,101,18};
   System.out.println( lengthOfLIS(nums));
   }
   
   
    public static int lengthOfLIS(int[] nums) {
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
}
