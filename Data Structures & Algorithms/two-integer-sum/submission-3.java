/*
We are going to using a hashamp
We are looking for a pair of number which equals target
x + y = target
nums[0] = 2 target = 9
target - x = y;
9 - 2 = 7;
If 7 is in the hashmap then we basically have our pair of numbers
we will just put 2 in our hashmap
and that is how we are going to build oru hashmap


*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(diff), i};
            }
        }
        return new int[]{};
    }
}
