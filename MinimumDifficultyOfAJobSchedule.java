import java.util.Arrays;

public class MinimumDifficultyOfAJobSchedule {
    
public static void main(String[] args) {
    int[]job=new int []{6,5,4,3,2,1};
    int d=2;
    minDifficulty(job, d);
}    
    
    public static int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty == null || jobDifficulty.length == 0) return 0;
        // There are not enough jobs to make "at least one task every day"
        if (jobDifficulty.length < d) return -1;

        int n = jobDifficulty.length;

        int[][] f = new int[d + 1][n + 1];
        // init
        for (int[] r: f) Arrays.fill(r, 1000 * d);
        f[0][0] = 0;  // The minimum difficulty on day 0 to get 0 job done is 0

        for (int i = 1; i <= d; i ++) {
            for (int j = i; n - j >= d - i; j++) {
			    int currMax = jobDifficulty[j - 1];
                for (int k = j - 1; k >= i - 1; k--) {
                    currMax = Math.max(jobDifficulty[k], currMax);  // jobDifficulty[k] means the job difficulty of (k + 1)th job, converted to be 0-index based
                    f[i][j] = Math.min(f[i][j], f[i - 1][k] + currMax);
                }
            }
        }

        for (int i = 0; i < d+1; i++) {
            for (int j = 0; j < n+1; j++) {
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(f[d][n]);
        return f[d][n];
    }

    // O(n)
   
}
