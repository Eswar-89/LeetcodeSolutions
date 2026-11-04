class Solution {
    public int minSwaps(String s) {
        int ones = 0, zeros = 0;
        for(char c : s.toCharArray()){
            if(c == '0') zeros++;
            else ones++;
        }
        if(Math.abs(ones - zeros) > 1) return -1;
        if(ones > zeros){
            return countSwaps(s, '1');
        }
        if(ones < zeros){
            return countSwaps(s, '0');
        }
        return Math.min(countSwaps(s, '0'), countSwaps(s, '1'));
    }
    
    int countSwaps(String s, char start){
        int wrong = 0;
        for(char c : s.toCharArray()){
            if(c != start) wrong++;
            start = (char) ('1' - start + '0');
        }
        return wrong/2;
    }
}