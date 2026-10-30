import java.util.*;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                count++;
                mp.put(count, i);
            }
        }

        for(int i = 0; i < queries.length; i++){
            if(mp.containsKey(queries[i])){
                queries[i] = mp.get(queries[i]);
            }else{
                queries[i] = -1;
            }
        }

        return queries;
    }
}