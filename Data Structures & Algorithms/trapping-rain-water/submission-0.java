class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        
        int max = 0;
        for (int i = 0; i < leftMax.length; i++) {
                if (height[i] > max) {
                    leftMax[i] = max;
                    max = height[i];
                } else {
                    leftMax[i] = max;
                }
        }

        max = 0;
        for (int j = height.length - 1; j > -1; j--) {
            if (height[j] > max) {
                rightMax[j] = max;
                max = height[j];
            } else {
                rightMax[j] = max;
            }
        }
        
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            int temp = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (temp > 0) {
                total += temp;
            } else {
                continue;
            }
        }
        return total;
    }
}
