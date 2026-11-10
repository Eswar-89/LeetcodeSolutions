import java.util.*;

//Method - 1
class Solution1 {
    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= 3; k++) {
                int i = j - k;
                if (i >= 0) {
                    long jump = (long)(j - i) * (j - i);
                    dp[j] = Math.min(dp[j], dp[i] + costs[j - 1] + jump);
                }
            }
        }
        return (int)dp[n];
    }
}


//Method - 2
class Solution2 {
    public int climbStairs(int n, int[] costs) {
        if(n == 1) return costs[0] + 1;
        int thirdBack = 0;
        int secondBack = costs[0] + 1;
        int firstBack = costs[1] + Math.min(secondBack + 1, 4);
        int result = firstBack;
        for(int i = 3; i <= n; i++){
            int oneStep = firstBack + 1;
            int twoStep = secondBack + 4;
            int threeStep = thirdBack + 9;
            result = costs[i - 1] + Math.min(oneStep, Math.min(twoStep, threeStep));
            thirdBack = secondBack;
            secondBack = firstBack;
            firstBack = result;
        }
        return result;
    }
}