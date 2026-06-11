class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = numbers.length -1;
        int[] answer = new int[2];
        for (int right = 0; right < numbers.length - 2; right++){
            while (right < left) {
                if ((numbers[right] + numbers[left]) == target) {
                    answer[0] = (right +1);
                    answer[1] = (left +1);
                    return answer;
                } else {
                left--;
                }
            }
        }

        return answer;
    }
}
