class MinStack {

    Stack<Integer> stackVal;
    Stack<Integer> minStorage;

    public MinStack() {
        stackVal = new Stack<>();
        minStorage = new Stack<>();
    }
    
    public void push(int val) {
        stackVal.push(val);
        if(minStorage.isEmpty()) {
            minStorage.push(val);
        }
        else {
            minStorage.push(Math.min(val, minStorage.peek()));
        }
    }
    
    public void pop() {
        stackVal.pop();
        minStorage.pop();
    }
    
    public int top() {
        return stackVal.peek();
    }
    
    public int getMin() {
        return minStorage.peek();
    }
}
