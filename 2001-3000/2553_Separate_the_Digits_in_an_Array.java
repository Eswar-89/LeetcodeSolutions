class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lis = new ArrayList<>();

        for(int num : nums){
            String s = String.valueOf(num);
            for(char ch : s.toCharArray()){
                lis.add(ch - '0');
            }
        }

        int [] res = new int [lis.size()];
        for(int i=0;i<lis.size();i++){
            res[i] = lis.get(i);
        }
        return res;
    }
}