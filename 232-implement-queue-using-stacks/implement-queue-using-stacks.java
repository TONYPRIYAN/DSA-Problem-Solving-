class MyQueue {
    Stack<Integer> ip = new Stack<>();
    Stack<Integer> op = new Stack<>();



    public MyQueue() 
    {
        
    }
    
    public void push(int x) 
    {
        ip.push(x);
        
    }
    
    public int pop() 
    {
        if(op.isEmpty())
        {
            while(!ip.isEmpty())
            {
                op.push(ip.pop());
                
            }
        }
       return op.pop();
    }
    
    public int peek() 
    {
        if(op.isEmpty())
        
            while(!ip.isEmpty())
            {
                op.push(ip.pop());
               
                
            }
        
        return op.peek();
        
    }
    
    public boolean empty() 
    {
        return op.isEmpty() && ip.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */