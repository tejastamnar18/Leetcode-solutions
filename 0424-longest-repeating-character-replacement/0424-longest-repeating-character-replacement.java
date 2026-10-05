class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            max = Math.max(max, hm.get(ch));

            if ((right - left + 1) - max > k) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}