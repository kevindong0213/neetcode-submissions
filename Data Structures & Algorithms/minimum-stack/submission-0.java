class MinStack {
    int min;
    List<Integer> stack;
    List<Integer> minArray;
    public MinStack() {
        this.stack = new ArrayList<>();
        this.minArray = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (minArray.isEmpty()) {
            minArray.add(val);
        } else {
            int cur = Math.min(val, minArray.get(minArray.size() - 1));
            minArray.add(cur);
        }
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minArray.remove(minArray.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minArray.get(minArray.size() - 1);
    }
}
