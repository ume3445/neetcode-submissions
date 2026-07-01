class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int[] res = new int[(nums.length - k) + 1];
        int max = Integer.MIN_VALUE;
        int nextFreeIndex = 0;
        while (j < nums.length) {
            if (j < i + k) {
                int temp = nums[j];
                max = Math.max(temp, max);
                j++;
            } else {
                res[nextFreeIndex] = max;
                nextFreeIndex++;
                i++;
                j = i;
                max = Integer.MIN_VALUE;
            }
        }
        res[nextFreeIndex] = max;
        return res;
    }
}
