package problems201To300.problem225;

import java.util.Deque;
import java.util.LinkedList;

class MyStack {

    Deque<Integer> deque;
    
    public MyStack() {
        this.deque = new LinkedList<>();
    }
    
    public void push(int x) {
        this.deque.push(x);    
    }
    
    public int pop() {
        return this.deque.pop();
    }
    
    public int top() {
        return this.deque.peek();
    }
    
    public boolean empty() {
        return this.deque.isEmpty();
    }
}