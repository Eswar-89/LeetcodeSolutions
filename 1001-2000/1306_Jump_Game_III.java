//Method - 1 (using BFS)

class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;

        boolean [] vis = new boolean [n];
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(start);
        while(!q.isEmpty()){
            int i = q.poll();

            if(i<0 || i>=n || vis[i])
                continue;
            
            if(arr[i] == 0)
                return true;
            
            vis[i] = true;
            q.offer(i + arr[i]);
            q.offer(i - arr[i]);
        }

        return false;
    }
}



//Method - 2 (Recursion)

class Solution {
    List<Integer> visited = new ArrayList<Integer>();

    public boolean canReach(int[] arr, int start) {
        if(start < 0 || start >= arr.length || visited.size() == arr.length){
            return false;
        }    

        if(arr[start]==0){
            return true;
        }

        else if(!visited.contains(start)) {
            visited.add(start);
            if(arr[start] == 1 && arr[arr.length - 1] == 0) {
                return true;
            }  
            return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
        } else {
            return false;
        }
    }
}