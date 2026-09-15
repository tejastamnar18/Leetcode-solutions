class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int max_s_sum = Integer.MIN_VALUE;
        int min_s_sum = Integer.MAX_VALUE;
        int array_sum = 0;

        int temp_max = 0;
        int temp_min = 0;
        for (int i = 0; i < n; i++) {
            array_sum += nums[i];
            temp_max += nums[i];
            max_s_sum = Math.max(temp_max, max_s_sum);
            temp_max = Math.max(temp_max, 0);

            temp_min += nums[i];
            min_s_sum = Math.min(min_s_sum, temp_min);
            temp_min = Math.min(temp_min, 0);
        }
        if (array_sum == min_s_sum) {
            return max_s_sum;
        }
        return Math.max(max_s_sum, (array_sum - min_s_sum));
    }
}