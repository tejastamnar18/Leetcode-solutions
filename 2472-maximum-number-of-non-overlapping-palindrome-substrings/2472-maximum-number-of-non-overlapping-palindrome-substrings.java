class Solution {
    public int maxPalindromes(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = (j - i) + 1;
                if (len > k + 1)
                    break;
                if (len >= k && isPalindrome(s, i, j)) {
                    ans++;
                    i = j;
                    break;
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}