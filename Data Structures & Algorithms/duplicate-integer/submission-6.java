/*
I : array of integers
O : Boolean
P : Create a new hashset. Iterate through the array. Insert every element in the hashset.
    Before inserting check if the number is already in the array. If yes return true. 
    if not return false.
*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}