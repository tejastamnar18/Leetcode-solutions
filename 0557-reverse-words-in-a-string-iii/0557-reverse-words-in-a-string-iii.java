class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String l : arr) {
            String r = reverse(l, 0, l.length() - 1);
            sb.append(r);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String reverse(String s, int left, int right) {
        char[] ch = s.toCharArray();
        while (left <= right) {
            char c = ch[left];
            ch[left] = ch[right];
            ch[right] = c;
            left++;
            right--;
        }
        return new String(ch);
    }
}