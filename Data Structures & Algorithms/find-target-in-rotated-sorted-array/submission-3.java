class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else {
                if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && nums[mid] > target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (target <= nums[right] && nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
