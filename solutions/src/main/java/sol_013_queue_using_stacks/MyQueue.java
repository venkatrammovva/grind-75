package sol_013_queue_using_stacks;

import java.util.Stack;


// https://leetcode.com/problems/implement-queue-using-stacks/
class MyQueue {

    Stack<Integer> s1, s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        makeSureS2isNotEmpty();
        return s2.pop();
    }
    
    public int peek() {
        makeSureS2isNotEmpty();
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    private void makeSureS2isNotEmpty() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}