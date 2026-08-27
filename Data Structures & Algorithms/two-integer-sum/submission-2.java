/*
an array named nums and an int called target
for output we have to return an array of int
we need to find two numbers which will be added and then 
become our target
an array called res for our result
Two pointers to give us a solution of O(n)^2

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                } else {
                    continue;
                }
            }
        }
        return res;
    }
}
