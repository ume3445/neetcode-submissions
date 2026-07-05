class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        int i =0;

        while (i < temperatures.length) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
            i++;
        }

        while (!stack.isEmpty()) {
            res[stack.peek()] = 0;
            stack.pop();
            continue;
        }
        return res;

    }
}
