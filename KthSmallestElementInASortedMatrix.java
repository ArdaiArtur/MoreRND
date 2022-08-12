public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        LongestIncreasingSubsequence ks=new LongestIncreasingSubsequence();
        int nums[]=new int []{1,3,6,7,9,4,10,5,6};
        ks.lengthOfLIS(nums);
    }
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==1)
        return matrix[0][0];
        int j=k%matrix[0].length;
        int set=0;
        int fin=0;
        for (int i = 0; i < matrix.length; i++) {
            set+=matrix[0].length;
            if(set>=k)
            {   if(j==0)
                fin=matrix[i][matrix[0].length-1];
                else
                fin=matrix[i][j-1];
                break;
            }
        }
        
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
 
        while(low<high){
 
            int mid = low + (high-low)/2;
            int count = lessEqual(matrix , mid);
 
            if(count<k) low = mid+1;
            else high = mid;
        }
 
        return low+fin;
     }
     
      public int lessEqual(int[][] matrix , int t ){
 
         int count=0;
         int i= matrix[0].length-1;
         int j=0;
 
         while(i>=0 && j<matrix.length){
 
             if(matrix[i][j]>t){
                 i--;
             }
             else{
                 count+=i+1;
                 j++;
             }
         }
 
         return count;
    }
}
