// Method - 1
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int cnt[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            cnt[Math.min(arr[i], n)]++;
        }

        int val = 0;
        for (int i = 1; i <= n; i++) {
            val = Math.min(i, val + cnt[i]);
        }

        return val;
    }
}




// Method - 2
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); 
        
        arr[0] = 1; 
        
        
        for (int i = 1; i < n; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        
        
        return arr[n - 1]; 
    }
}