class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target >= nums[left] && nums[mid] > target) {
                if (nums[left] == target) {
                    return left;
                }
                right = mid - 1;
            } else {
                if (nums[right] == target) {
                    return right;
                }
                left = mid + 1;
            }
        }
        return -1;
    }
}
