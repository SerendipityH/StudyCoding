package com.serendipity.java8;

import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/17 18:14
 */
public class LeetCodeOffer30 {
     Stack<Integer> minStack;
     Stack<Integer> stack;
    /** initialize your data structure here. */
    public LeetCodeOffer30() {
        minStack =  new Stack<Integer>();
        stack = new Stack<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
