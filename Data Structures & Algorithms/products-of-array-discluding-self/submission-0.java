class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else{
                    answer[i] = answer[i] * nums[j];
                }
            }
        }
        return answer;
    }
}  
