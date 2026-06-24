import java.util.*;
public class implementQueueUsingStack{
    Stack<Integer> st= new Stack<>();
    Stack<Integer> helper= new Stack<>();
    //public MyQueue() {
        
    //}
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1) helper.push(st.pop());
        int x= st.pop();
        while(helper.size()>0) st.push(helper.pop());
        return x;
    }
    
    public int peek() {
        while(st.size()>1) helper.push(st.pop());
        int x= st.peek();
        while(helper.size()>0) st.push(helper.pop());
        return x;
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        return false;
    }
    public static void main(String[] args) {
        implementQueueUsingStack q=new implementQueueUsingStack();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.empty());
        
    }
}