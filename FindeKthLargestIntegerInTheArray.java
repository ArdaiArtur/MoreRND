import java.math.BigInteger;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FindeKthLargestIntegerInTheArray {
    public String kthLargestNumber(String[] nums, int k) {
       
       
        PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();
        for(int i = 0;i<k;i++) {
            minHeap.add(new BigInteger(nums[i]));
        }
        
        for(int j = k;j<nums.length;j++) {
            BigInteger number  = new BigInteger(nums[j]);
            int comparevalue = number.compareTo(minHeap.peek());    
              
             //checks if the number is greater than the peek element (smallest element will be on top of queue)
            if(comparevalue == 1) {
                // remove the smallest element and add the numberb to Queue
                minHeap.poll();
                minHeap.add(number);    
            }
        }
        
        return minHeap.peek().toString();  
    }
}
