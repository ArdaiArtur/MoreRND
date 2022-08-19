import java.util.HashSet;

public class SplitArrayIntoConsecutiveSubsequences {
    public boolean isPossiblex(int[] nums) {
      if(nums.length<3) return false;
        int i=1;
     HashSet<Integer>hs=new HashSet<>();
     int count=0;
     int div=nums.length/3;
     System.out.println(div);
     hs.add(nums[0]);
        while(i<nums.length)
        {
           
           if(nums[i-1]<=nums[i])
           {
            hs.add(nums[i]);
           }
           
            if(hs.size()>=3)
            {hs.clear();
                count++;
            }
           if(count>=div&&hs.size()==0)
           return true;
           i++;

        }
        return false;
    }

/*

Here NN is the size of the nums array.

Time complexity: O(N).

At one glance, it might look that the isSegmentValid function takes O(N) time. 
However, upon closer inspection of the values of the start and end variables, 
we can see that the for loop in the isSegmentValid function iterates over each element of 
the nums array only once. The start and the end variables denote the starting and 
the ending index of a segment at any point respectively. 
The isSegmentValid function is run for each segment only once. 
Thus, the overall time complexity is O(N).

Space complexity: O(1).

Ony a constant amount of extra space is required for this approach.
*/
    public boolean isPossible(int[] nums) {
        int n = nums.length, start = 0;

        for (int i = 1; i < n; i++) {
            //Check possibility of a valid segment starting at index start and ending at index i - 1.
            if (nums[i] - nums[i - 1] > 1) {
                if (!isSegmentValid(nums, start, i - 1)) {
                    return false;
                }
                //Update the starting index of the next segment.
                start = i;
            }
        }
        //Check for the last segment
        return isSegmentValid(nums, start, n - 1);
    }

    private boolean isSegmentValid(int[] nums, int start, int end) {
        int frequency = 0;

        //lengthOneSubsequences holds count of subsequences of length 1.
        int lengthOneSubsequences = 0;

        //lengthTwoSubsequences holds count of subsequences of length 2.
        int lengthTwoSubsequences = 0;

        //totalNoOfSubsequences holds count of all subsequences.
        int totalNoOfSubsequences = 0;

        for (int i = start; i <= end; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                frequency++;
            } else if (frequency < lengthOneSubsequences + lengthTwoSubsequences) {
                // If the frequency[i] is less than total number of subsequences ending with i - 1,
                // we do not have enough subsequences where we can put i.
                return false;
            } else {
                // Total number of subsequences of length 2 can be obtained by 
                // adding i to subsequences of length 1 ending with i - 1.
                lengthTwoSubsequences = lengthOneSubsequences;
                lengthOneSubsequences = Math.max(0, frequency - totalNoOfSubsequences);
                totalNoOfSubsequences = frequency;
                frequency = 1;
            }
        }
        // For the last element in the segment
        lengthTwoSubsequences = lengthOneSubsequences;
        lengthOneSubsequences = Math.max(0, frequency - totalNoOfSubsequences);
        // If there is no remaining subsequence of length one or two, we can return true. 
        // Otherwise, return false.
        return lengthOneSubsequences == 0 && lengthTwoSubsequences == 0;
    }





}
