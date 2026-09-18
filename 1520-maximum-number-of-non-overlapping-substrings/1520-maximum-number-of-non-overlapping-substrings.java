class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] L = new int[26], R = new int[26];
        Arrays.fill(L, -1);
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (L[c] < 0) L[c] = i;
            R[c] = i;
        }
        List<int[]> ivs = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (L[i] < 0) continue;
            int l = L[i], r = R[i]; boolean ok = true;
            for (int j = l; j <= r && ok; j++)
                if (L[s.charAt(j) - 'a'] < l) ok = false; else r = Math.max(r, R[s.charAt(j) - 'a']);
            if (ok) ivs.add(new int[]{r, l});
        }
        ivs.sort((a, b) -> a[0] - b[0]);
        List<String> res = new ArrayList<>(); int last = -1;
        for (int[] iv : ivs) if (iv[1] > last) { res.add(s.substring(iv[1], iv[0] + 1)); last = iv[0]; }
        return res;
    }
}