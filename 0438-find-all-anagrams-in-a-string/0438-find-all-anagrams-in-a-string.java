class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())
            return list;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int count = p.length();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            int val = map.getOrDefault(ch, 0);
            if (val > 0)
                count--;
            map.put(ch, val - 1);

            if (right - left + 1 > p.length()) {
                char leftChar = s.charAt(left);
                int leftVal = map.getOrDefault(leftChar, 0);
                if (leftVal >= 0) {
                    count++;
                }
                map.put(leftChar, leftVal + 1);
                left++;
            }
            if (count == 0) {
                list.add(left);
            }
        }
        return list;
    }
}