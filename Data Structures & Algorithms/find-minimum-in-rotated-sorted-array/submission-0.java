class Solution {
    public int findMin(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int res = Integer.MAX_VALUE;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[right] < nums[mid]) {
                left = mid + 1;
                res = Math.min(nums[mid], res);
            } else {
                right = mid;
                res = Math.min(nums[mid], res);
            } 
        }
        return res;
    }
}
