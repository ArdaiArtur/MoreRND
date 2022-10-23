public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int []count=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;

        }
        int two=0,none=0;
        for (int i = 1; i < count.length; i++) {
            if(count[i]==0) 
            {
                none=i;
                if(none!=0&&two!=0)
                break;
            }

            if(count[i]==2)
            {
                 two=i;
                 if(none!=0&&two!=0)
                break;
            }
        }
        return new int []{two,none};

    }
}
