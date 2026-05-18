class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;

        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            // map.computeIfAbsent(nums[i], k -> new ArrayList<>().add(i));
            int num=nums[i];
            if(!map.containsKey(num)){
                map.put(num,new ArrayList<>());
                map.get(num).add(i);
            }else{
                map.get(num).add(i);
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        boolean [] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int steps = 0;

        while(!q.isEmpty()){
            int len = q.size();

            for(int i=0; i<len; i++){
                int idx = q.poll();
                if(idx == n-1){
                    return steps;
                }
                if(idx - 1 >= 0 && !vis[idx-1]){
                    q.offer(idx-1);
                    vis[idx-1] = true;
                }
                if(idx + 1 < n && !vis[idx+1]){
                    q.offer(idx+1);
                    vis[idx+1] = true;
                }
                if(map.containsKey(nums[idx])){
                    for(int num : map.get(nums[idx])){
                        if(!vis[num]){
                            q.offer(num);
                            vis[num] = true;
                        }
                    }
                    map.remove(nums[idx]);
                }
            }
            steps++;
        }
        return steps;
    }
}