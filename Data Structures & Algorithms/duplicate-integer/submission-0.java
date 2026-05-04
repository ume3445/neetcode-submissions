class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }
}