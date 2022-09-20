/**
 * sometest
 */
public class sometest {

    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4,7};
        int[] b=new int[]{1,2,1,4,7};
      System.out.println(  findLengthsomemore(a, b));

    }
    public static int findLengthsomemore(int[] A, int[] B) {
        int ans = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        for (int i = 1; i<A.length +1; i++) {
            for (int j = 1; j  <B.length+1; j++) {
                if (A[i-1] == B[j-1]) {
                    memo[i][j] = memo[i-1][j-1] + 1;
                    if (ans < memo[i][j]) ans = memo[i][j];
                }
            }
        }
        return ans;
    }

    public static int findLength(int[] A, int[] B) {
        int ans = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        for (int i = A.length - 1; i >= 0; --i) {
            for (int j = B.length - 1; j >= 0; --j) {
                if (A[i] == B[j]) {
                    memo[i][j] = memo[i+1][j+1] + 1;
                    if (ans < memo[i][j]) ans = memo[i][j];
                }
            }
        }
        return ans;
    }

}