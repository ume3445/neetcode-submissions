class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if (set.contains(nums[i] - 1)) {
                continue;
            } else {
                int currentNum = nums[i];
                int j = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    j++;
                }
                if (j > count) {
                    count = j;
                } else {
                    j = 0;
                }

            }
        }
        return count;
    }
}
