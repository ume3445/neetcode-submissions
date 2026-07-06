class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int[][] pairs = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < position.length; i++) {
            double iterations = (double)(target - pairs[i][0]) / pairs[i][1];
            if (stack.isEmpty()) {
                stack.push(iterations);
            } else {
                if (stack.peek() <  iterations) {
                    stack.push(iterations);
                } else {
                    continue;
                }
            }
        }
        return stack.size();
    }
}
