class Solution {
    private static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int odd = 0, even = 0;

        for(int i=1;i<2*n;i+=2){
            odd += i;
            even += (i + 1);
        }
        return gcd(odd, even);
    }
}