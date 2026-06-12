class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = 0;
        int left = numbers.length - 1;
        int[] answer = new int[2];
        while (right < left) {
            if ((numbers[right] + numbers[left]) < target) {
                right++;
            } else if ((numbers[right] + numbers[left]) > target) {
                left--;
            } else if ((numbers[right] + numbers[left]) == target) {
                answer[0] = right +1;
                answer[1] = left +1;
                return answer;
            }
        }
        return answer;
    }
}
