import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c== '['){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                char t = st.peek();
                if((c==')' && t== '(')|| (c=='}'&& t=='{') || (c==']' && t=='[')){
                    st.pop();
                }else return false;

            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}