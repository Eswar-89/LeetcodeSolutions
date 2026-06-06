// Method - 1 :
// TC = O(n)  Sc = O(n)
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;
        for(int num : nums){
            rightSum += num;
        }
        int [] res = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            rightSum -= nums[i];
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}


// Method - 2 :
// TC = O(n)  Sc = O(1)
class Solution2 {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0, leftSum = 0, n = nums.length;
        for(int num : nums){
            rightSum += num;
        }
        for(int i=0;i<n;i++){
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
        return nums;
    }
}