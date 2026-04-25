class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long [] ans = new long [n];

        Map<Integer, List<Integer>> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            mp.computeIfAbsent(nums[i] , k -> new ArrayList<>()).add(i);
        }

        for(List<Integer> pos : mp.values()){

            long sum = 0;
            for(int x : pos) sum += x;

            long leftsum = 0;
            int m = pos.size();

            for(int i=0;i<m;i++){
                long rightsum = sum - leftsum - pos.get(i);

                long left = (long) pos.get(i) * i - leftsum;
                long right = rightsum - (long) pos.get(i) * (m-1-i);

                ans[pos.get(i)] = left + right;

                leftsum += pos.get(i);
            }
        }
        return ans;
    }
}