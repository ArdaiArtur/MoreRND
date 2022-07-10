import java.util.Collections;
import java.util.PriorityQueue;

public class JumpGameVI {
    public static void main(String[] args) {
        int k=2;
        int []nums=new int[]{1,-5,-20,4,-1,3,-6,-3};
        maxResult(nums, k);
    }
    public static int maxResult(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        
        // To reach at index 0, maxScore is nums[0]
        int maxScore = nums[0];
        
        // [index, max], maxScore will at top
        PriorityQueue<int[]> pq = new  PriorityQueue<>((a,b)->b[1]-a[1]);
        
        //add first index and its score at top
        pq.offer(new int[]{0, nums[0]});
        
        // now, we find maxScore to reach till ith index
        for(int i=1; i<nums.length; i++){
            // if (i-peek[])<=k 
            while(!(i-pq.peek()[0]<=k)){
                int [] s=pq.poll();
                System.out.println(s[0]+"huh "+" now"+s[1]);
            }
            // get the peek of queue
            int[] top = pq.peek();
            
            maxScore = top[1] + nums[i];
            System.out.println(top[0]+top[1]+"befor/ max"+maxScore);
            // get maxScore and add it queue
            pq.offer(new int[]{i, maxScore});
        }
        return maxScore;
    }
}
