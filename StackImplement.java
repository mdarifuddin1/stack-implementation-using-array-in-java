
package Stack;


public class StackImplement {
    
    int top,capacity;
    int [] stack;
    
    StackImplement()
    {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
        
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public boolean isFull()
    {
        return top == capacity -1;
    }
    
    public int push (int data)
    {
        if(isFull())
        {
            System.out.println("The Stack is Full");
        }
        return stack[++top] = data;
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is Empty");
        }
        return stack[--top];
    }
    
    public int peek()
    {
        return stack[top];
    }
    
    public void display()
    {
        for(int i: stack)
        {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        
        StackImplement st = new StackImplement ();
        st.push(45);
        st.push (56);
        st.push (32);
        st.push (05);
        
        //System.out.println(st.isEmpty());
        //System.out.println(st.isFull());
       // System.out.println(st.capacity);
        //System.out.println(st.peek());
        //System.out.println(st.pop());
        
        st.display();
        
    }
    
}
