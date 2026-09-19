class Solution {
    public int maxAbsoluteSum(int[] nums) {
        return Math.max(
                Math.abs(minSS(nums)),
                Math.abs(maxSS(nums))
        );
    }

    private int maxSS(int[] nums) {
        int temp = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            temp += num;
            if (temp > max) {
                max = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }
        return max;
    }

    private int minSS(int[] nums) {
        int temp = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            temp += num;
            if (min > temp) {
                min = temp;
            }
            if (temp > 0) {
                temp = 0;
            }
        }
        return min;
    }
}