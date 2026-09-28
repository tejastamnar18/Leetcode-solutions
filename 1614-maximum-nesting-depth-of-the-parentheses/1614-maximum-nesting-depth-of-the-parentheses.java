class Solution {
    public int maxDepth(String s) {
        int temp = 0;
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                temp++;
                max = Math.max(temp, max);
            } else if (ch == ')') {
                temp--;
            }
        }
        return max;
    }
}