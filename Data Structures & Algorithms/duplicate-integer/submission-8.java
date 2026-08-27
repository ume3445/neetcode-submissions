/*
inputs we have an integer array
output boolean true if it contains a duplicate and false if not
the brute force: I use two pointers
have two pointers through two traversal loops
I could sort them and then check since that would put both the duplicates together
I will check if i == j then return true 
else 
continue and then just return false if both loops are null
*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res = true;
                } else {
                    continue;
                }
            }
        }
        return res;
    }
}