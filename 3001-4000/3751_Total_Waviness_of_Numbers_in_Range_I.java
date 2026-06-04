class Solution {

    private int waviness(int x){
        int cnt = 0;
        String s = Integer.toString(x);

        for(int i=1; i<s.length()-1; i++){
            char cur = s.charAt(i);

            if ((cur > s.charAt(i - 1) && cur > s.charAt(i + 1)) || (cur < s.charAt(i - 1) && cur < s.charAt(i + 1))) {
                cnt++;
            }
        }
        return cnt;
    }

    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for(int i = num1; i <= num2; i++){
            ans += waviness(i);
        }

        return ans;
    }
}