class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1, x = n;

        while(x != 0){
            int d = x % 10;
            sum += d;
            prod *= d;
            x /= 10;
        }

        if(n % (sum + prod) == 0){
            return true;
        }
        return false;
    }
}