class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
                left++;
            }
        }
        return nums;
    }
}