class MinStack {

    public Stack<Integer> stack; 
    public Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>(); 
    }
    
    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (minStack.peek().equals(stack.peek())) {
            minStack.pop();
        }
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
         return minStack.peek();
    }
}
