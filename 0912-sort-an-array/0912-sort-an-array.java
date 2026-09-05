class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    public void divide(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(nums, low, mid);
        divide(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int cnt = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[cnt++] = nums[left++];
            } else {
                temp[cnt++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[cnt++] = nums[left++];
        }
        while (right <= high) {
            temp[cnt++] = nums[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }
}