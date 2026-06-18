class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                
                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {
                    int sum = nums[j] + nums[i] + nums[k];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[i]);
                        answer.add(list);
                        while (j < k && nums[j] == nums[j+1]) {
                            j++;
                        }
                        while (k > j && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++;
                        k--;
                    }
                }
            }
        }
        return answer;
    }
}
