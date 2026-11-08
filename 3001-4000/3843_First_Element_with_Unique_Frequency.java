import java.util.*;

//Method-1
class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for(int current : counter.keySet()){
            int count = counter.get(current);
            freq.put(count, freq.getOrDefault(count, 0) + 1);
        }

        for(int num : nums){
            int count = counter.get(num);
            if(freq.get(count) == 1) return num;
        }

        return -1;
    }
}


//Method-2
class Solution2 {
    public int firstUniqueFreq(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            m=Math.max(i,m);
        }
        int []f = new int[m+1];
        for(int i:nums){
            f[i]++;
        }
        int []f2=new int[nums.length+1];
        for(int i:f){
            f2[i]++;
        }
        for(int i:nums){
            if(f2[f[i]]==1){
                return i;
            }
        }
        return -1;  
    }
}