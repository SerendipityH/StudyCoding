package com.serendipity.java8;

import java.sql.Statement;
import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/16 20:09
 */
public class LeetCodeMian0302 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public LeetCodeMian0302() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
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

    public int getMin() {
        return minStack.peek();
    }
}
