public class SearchA2DmatixII {
    public static void main(String[] args) {
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while (i<matrix.length&&j>=0) 
        {
         if(matrix[i][j]==target)
         return true;
         else if(matrix[i][j]>target)
         {j--;}
         else if(matrix[i][j]<target)
         {
            i++;
         }   
        }
        return false;
    }
}
