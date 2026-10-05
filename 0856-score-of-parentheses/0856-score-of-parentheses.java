class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(0);
            } else {
                int in = st.pop();
                int curr = (in == 0) ? 1 : 2 * in;
                st.push(curr + st.pop());
            }
        }
        return st.pop();
    }
}