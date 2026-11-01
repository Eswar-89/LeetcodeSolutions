class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int a : nums){
            if(a < min) min = a;
        }
        long moves = 0;
        for(int a : nums){
            moves += a - min;
        }
        return (int) moves;
    }
}