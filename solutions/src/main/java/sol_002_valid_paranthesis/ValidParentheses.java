package sol_002_valid_paranthesis;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses
public class ValidParentheses {
    private static final Set<Character> openingBraces = Set.of('{', '(', '[');
    private static final Map<Character, Character> map = Map.of( ')', '(','}','{',']', '[');
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            char curr = arr[i];
            if(openingBraces.contains(curr) || st.isEmpty()) {
                st.push(curr);
            } else {
                char top = st.peek();
                if(top == map.get(curr)) {
                    st.pop();
                } else {
                    st.push(curr);
                }
            }
        }
        return st.isEmpty();
    }
}
