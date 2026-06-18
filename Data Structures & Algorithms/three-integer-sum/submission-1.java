class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> list_answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i -1]) {
                continue;
            } else {
                set.clear();
                for (int j = i + 1; j < nums.length; j++) {
                    List<Integer> list = new ArrayList<>();
                    int num = -(nums[i] + nums[j]);
                    if (set.contains(num)) {
                        list.add(num);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list_answer.add(list);
                        while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                            j++;
                        }
                    } else {
                        set.add(nums[j]);
                    }
                }
            }
        }
        return list_answer;
    }
}
