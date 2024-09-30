class CustomStack {
    int stack[];
    int capacity;
    int size;
    int top;
    public CustomStack(int maxSize) {
        stack=new int[maxSize];
        capacity=maxSize;
        size=0;
        top=-1;
    }
    
    public void push(int x) {
        if(isFull()){
            return;
        }
        top++;
        size++;
        stack[top]=x;
    }
    
    public int pop() {
        if(isEmpty())
            return -1;
        int ele=stack[top];
        top--;
        size--;
        return ele;
    }
    
    public void increment(int k, int val) {
        int min=Math.min(k,size);
        for(int i=0;i<min;i++)
            stack[i]+=val;
    }

    private boolean isFull(){
        return (size==capacity);    
    }
    private boolean isEmpty(){
        return (size==0);    
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */