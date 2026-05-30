class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] answer = new int[nums.length];

        arr1[0] = 1; 
        for (int i = 1 ; i < arr1.length;i++) {
            arr1[i] = nums[i-1] * arr1[i-1];
        } 

        arr2[nums.length - 1] = 1;
        for (int i = nums.length -2; i >= 0; i--) {
            arr2[i] = nums[i+1] * arr2[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = arr2[i] * arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        return answer;
    }
}  
