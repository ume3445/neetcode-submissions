class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < tokens.length) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                int c = Integer.parseInt(tokens[i]);
                stack.push(c);
                i++;
            } else {
                if (!stack.isEmpty()) {
                    if (tokens[i].equals("+")) {
                        int res = stack.pop() + stack.pop();
                        stack.push(res);
                        i++;
                    } else if (tokens[i].equals("-")) {
                        int b = stack.pop();
                        int a = stack.pop();
                        int res = a - b;
                        stack.push(res);
                        i++;
                    } else if (tokens[i].equals("*")) {
                        int res = stack.pop() * stack.pop();
                        stack.push(res);
                        i++;                    
                    } else if (tokens[i].equals("/")) {
                        int b = stack.pop();
                        int a = stack.pop();
                        int res = a / b;
                        stack.push(res);
                        i++;
                    }
                } else {
                    return 0;
                }
            }
        }
        return stack.pop();
    }
}
