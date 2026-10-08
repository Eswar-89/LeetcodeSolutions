class Solution {
    public String removeOuterParentheses(String s) {
        int bal = 0;
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(bal > 0) res.append(c);
                bal++;
            }else{
                --bal;
                if(bal > 0) res.append(c);
            }
        }
        return res.toString();
    }
}