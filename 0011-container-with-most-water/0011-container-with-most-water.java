class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int min = 0;
        int res = 0;
        while (left < right) {
            min = Math.min(arr[left], arr[right]);
            int width = right - left;
            res = Math.max(min * width, res);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}