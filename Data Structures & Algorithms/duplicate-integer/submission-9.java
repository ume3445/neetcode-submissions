/*
inputs we have an integer array
output boolean true if it contains a duplicate and false if not
the brute force: I use two pointers
have two pointers through two traversal loops
I could sort them and then check since that would put both the duplicates together
I will check if i == j then return true 
else 
continue and then just return false if both loops are null

now to optimise this what I am thinking is two approaches.
One is to sort the arrays that will put the duplicates together so 1,2,3,3,4 if it has any.
That will give us a solution of O(n log n)
But there is another thing that I am thinking and that is we could use a hashset.
As you iterate through the array what you could basically do is that you keep putting the values in a hashmap and use an if condition where if the hashset contains the value it should just return true;
*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                res = true;
            } else {
                set.add(nums[i]);
            }
        }
        return res;
    }
}