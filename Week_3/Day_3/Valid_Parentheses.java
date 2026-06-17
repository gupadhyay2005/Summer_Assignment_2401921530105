import java.util.*;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }

            // closing brackets
            else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if (c == ')' && top != '(') {
                    return false;
                }

                if (c == '}' && top != '{') {
                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}
