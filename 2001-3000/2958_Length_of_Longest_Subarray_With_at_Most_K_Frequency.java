import java.util.*;


class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int res = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        for(int right = 0; right < n; right++){
            freq.put(
                nums[right],
                freq.getOrDefault(nums[right], 0) + 1
            );

            while(freq.get(nums[right]) > k){
                freq.put(
                    nums[left],
                    freq.get(nums[left]) - 1
                );
                left++;
            }

            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}