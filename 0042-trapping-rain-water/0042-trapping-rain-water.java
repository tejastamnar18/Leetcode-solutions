class Solution {
    public int trap(int[] height) {
        int water = 0;
        int l = 0;
        int r = height.length - 1;
        int maxl = height[0];
        int maxr = height[height.length - 1];

        while (l < r) {
            if (height[l] > height[r]) {
                maxr = Math.max(height[r], maxr);
                water += maxr - height[r];
                r--;
            } else {
                maxl = Math.max(height[l], maxl);
                water += maxl - height[l];
                l++;
            }
        }
        return water;
    }
}