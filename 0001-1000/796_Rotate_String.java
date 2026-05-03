class Solution {
    public boolean rotateString(String s, String goal) {
        int slen = s.length();
        int goallen = goal.length();

        if(slen != goallen) return false;

        for(int i=0;i<slen;i++){
            int j = 0;
            while(j < slen && goal.charAt(j) == s.charAt((i+j) % slen) ){
                j++;
            }
            if(j == slen) return true;
        }
        return false;
    }
}