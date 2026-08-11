class Solution {
    public int missingInteger(int[] a) {
        int n = a.length;
        Set<Integer> seen = new HashSet<>();

        for(int num : a){
            seen.add(num);
        }
        int sum = a[0];
        for(int i=1;i<n;i++){
            if(a[i] == a[i-1]+1){
                sum += a[i];
            }else{
                break;
            }
        }

        while(seen.contains(sum)){
            sum++;
        }
        return sum;
    }
}