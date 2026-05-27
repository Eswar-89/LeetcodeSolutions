class Solution {
    public int numberOfSpecialChars(String word) {
        int [] l = new int [26];
        int [] u = new int [26];
        java.util.Arrays.fill(l, -1);
        java.util.Arrays.fill(u, -1);
        int n = word.length();

        for(int i=0;i<n;i++){
            char c = word.charAt(i);
            if(c >= 'a'){
                l[c - 'a'] = i;
            } else if(u[c - 'A'] == -1){
                u[c - 'A'] = i;
            }
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            if(l[i] != -1 && u[i] != -1 && l[i] < u[i])
                ans++;
        }
        return ans;
    }
}