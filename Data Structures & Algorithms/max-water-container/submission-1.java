class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int volume = 0;
        while (i < j) {
            int area = Math.min(heights[i], heights[j]) * (j - i);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
            volume = Math.max(volume, area);
        }
        return volume;  
    }
}
