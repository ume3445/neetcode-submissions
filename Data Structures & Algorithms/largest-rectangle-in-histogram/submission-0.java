class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = Integer.MIN_VALUE;


        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int element = stack.peek();
                stack.pop();
                int nse = i;
                int pse = 0;
                if (stack.isEmpty()) {
                    pse = -1;
                } else {
                    pse = stack.peek();
                }
                maxArea = Math.max(maxArea, (heights[element] * (nse - pse - 1)));
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
                int element = stack.peek();
                stack.pop();
                int nse = heights.length;
                int pse = 0;
                if (stack.isEmpty()) {
                    pse = -1;
                } else {
                    pse = stack.peek();
                }
                maxArea = Math.max(maxArea, (heights[element] * (nse - pse - 1)));
            }
        return maxArea;
    }
}
