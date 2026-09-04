class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            for (int j = i; j < nums.length; j++) {
                min = Math.min(nums[j], min);
            }
            max = Math.max(nums[i], max);
            if (max - min <= k) {
                return i;
            }
        }
        return -1;
    }
}