class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        for(int i=0;i<n;i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        return gcd(min, max);
    }
    int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}