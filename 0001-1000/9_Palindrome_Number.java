class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rem;
        int rev=0;
        int n=x;
        while(x>0){
            rem = x%10;
            rev = rev*10 + rem;
            x=x/10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
}