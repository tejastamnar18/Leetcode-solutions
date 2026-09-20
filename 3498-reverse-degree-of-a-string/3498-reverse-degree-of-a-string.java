class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int v = 26 - (c - 'a');
            v = v * (i + 1);
            res += v;
        }
        return res;
    }
}