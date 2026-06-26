class Solution {
    public int maxArea(int[] heights) {
        int width = heights.length - 1;
        int j = heights.length - 1;
        int i = 0;
        int volume = 0;
        while (i < j) {
            if (heights[i] < heights [i + 1]) {
                i++;
                width--;
            } else if (heights[j] < heights[j - 1]) {
                j--;
                width--;
            } else {
                break;
            }
        }
        if (heights[i] < heights[j]) {
            volume = width * heights[i];
        } else {
            volume = width * heights[j];
        }
        return volume;
    }
}
