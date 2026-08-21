class Solution {
    public int maxArea(int[] height) {
        int l1 = 0;
        int l2 = height.length-1;
        int area = 0;
        while(l1<=l2){
            int res = Math.abs(l2-l1) * Math.min(height[l1],height[l2]);
            area = Math.max(area,res);
            if(height[l1]<=height[l2]){
                l1++;
            }else{
                l2--;
            }
        }
        return area;
    }
}