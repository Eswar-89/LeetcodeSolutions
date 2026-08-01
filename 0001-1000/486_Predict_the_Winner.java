class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        if((n & 1) == 0) return true;

        int [][] dp = new int [n][n];
        for(int [] row : dp){
            Arrays.fill(row, -1);
        }
        return maxDiff(0, n-1, nums, dp) >= 0;
    }

    private int maxDiff(int i, int j, int[] A, int[][] dp) {
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (i == j) {
            return dp[i][j] = A[i];
        }

        int takeLeft = A[i] - maxDiff(i + 1, j, A, dp);
        int takeRight = A[j] - maxDiff(i, j - 1, A, dp);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
}