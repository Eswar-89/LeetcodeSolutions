class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxSum = 0;
        for(int a : gain){
            sum += a;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}