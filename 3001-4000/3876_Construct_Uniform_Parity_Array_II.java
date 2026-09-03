class Solution {
    public boolean uniformArray(int[] nums) {
        int smallestOdd = Integer.MAX_VALUE;

        for(int num : nums){
            if(num % 2 == 1) smallestOdd = Math.min(smallestOdd, num);
        }

        // Which means all elements are even
        if(smallestOdd == Integer.MAX_VALUE) 
            return true;

        for(int num : nums){
            //Which means can not bring every element into a same parity
            if(num % 2 == 0 && num <= smallestOdd)
                return false;
        }
        return true;
    }
}