class Solution {
    public int removeDuplicates(int[] nums) {
        int temp =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[temp-1]){
                nums[temp]=nums[i];
                temp++;
            }
        }
        return temp;
    }
}