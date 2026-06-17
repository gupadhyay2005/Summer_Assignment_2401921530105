class MinStack {
    Stack<Integer>  minstack = new Stack<>();
        Stack<Integer>  s = new Stack<>();


    public MinStack() {
    }

    
    public void push(int value) {
       
    s.push(value);
    if(minstack.isEmpty() || minstack.peek()>=value){
        minstack.push(value);
    }
        
    }
    
    public void pop() {
        if(minstack.peek().equals(s.peek())){
            minstack.pop();
        }
        
        s.pop();
        
            }
    
    public int top() {
        return  s.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        }
        
        
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
