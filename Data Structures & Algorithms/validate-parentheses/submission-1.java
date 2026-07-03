class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean res = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.size() > 0) {
                if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        res = false;
                    }
                } else if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        res = false;
                    }
                } else if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        res = false;
                    }
                }
            }
        }
        if (stack.size() == 0) {
            res = true;
        }

        return res;
    }
}
