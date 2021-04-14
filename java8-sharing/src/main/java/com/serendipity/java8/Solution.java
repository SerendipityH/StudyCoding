package com.serendipity.java8;

import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/6 21:45
 */
public class Solution {
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public Solution() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStack.isEmpty()){
            valueOut();
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            valueOut();
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void valueOut(){
        while(!inStack.isEmpty()){
            outStack.peek();
        }
    }



    public static void main(String[] args) {
        Solution queue = new Solution();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek()); // 返回 1
        System.out.println(queue.pop());// 返回 1
        System.out.println(queue.empty()); // 返回 false


    }
}
