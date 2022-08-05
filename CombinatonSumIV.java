public class CombinatonSumIV {
 public static void main(String[] args) {
    int []nums=new int[]{1,2,3};
    combinationSum4(nums, 4);
 }  

 public static int combinationSum4(int[] nums, int target) {
        Integer[] memo = new Integer[target + 1];
        return recurse(nums, target, memo);
    }
    
    public static int recurse(int[] nums, int remain, Integer[] memo){
        System.out.print("unpas ");
        if(remain < 0) return 0;
        if(memo[remain] != null) return memo[remain];
        if(remain == 0) return 1;
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += recurse(nums, remain - nums[i], memo);
            System.out.print(ans+"thisisinit ");
        }
        System.out.println();
        memo[remain] = ans;
        System.out.println("this is remain"+ans);
        return memo[remain];
    }
}
