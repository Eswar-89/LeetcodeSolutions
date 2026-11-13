import java.util.*;

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int score = nums[n-1] - nums[0];
        int ans = score;
        for(int i = 0; i < n-1; i++){
            int maxAfterDiv = Math.max(nums[i] + k, nums[n-1] - k);
            int minAfterDiv = Math.min(nums[i+1] - k, nums[0] + k);
            score = maxAfterDiv - minAfterDiv;
            ans = Math.min(ans, score);
        }
        return ans;
    }
}