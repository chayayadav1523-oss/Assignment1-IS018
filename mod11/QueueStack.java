//Leetcode 232 Implement Queue Using Stack

import java.util.*;

class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        move();
        return outStack.pop();
    }

    public int peek() {
        move();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void move() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}

public class QueueStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.peek()); // 1
        System.out.println(q.pop());  // 1
        System.out.println(q.empty()); // false
    }
}