class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int more = target - num;
            if(hm.containsKey(more)){
                return new int [] {hm.get(more),i};
            }
            hm.put(num,i);
        }
        return new int [] {-1,-1};
    }
}