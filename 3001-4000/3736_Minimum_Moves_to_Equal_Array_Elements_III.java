class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int a : nums){
            sum += a;
            max = Math.max(max, a);
        }
        return n * max - sum;
    }
}