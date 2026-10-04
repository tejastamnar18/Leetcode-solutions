class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }
        int map[] = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int left = 0;
        int right = 0;
        int minLeft = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length();

        while (right < s.length()) {
            char rightChar = s.charAt(right);

            if (map[rightChar] > 0) {
                count--;
            }
            map[rightChar]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                map[leftChar]++;

                if (map[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}