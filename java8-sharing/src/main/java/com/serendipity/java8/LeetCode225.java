package com.serendipity.java8;

import java.util.*;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/14 21:16
 */
public class LeetCode225 {
    static Queue<Integer> queue1 = new LinkedList<Integer>();;
    static Queue<Integer> queue2 = new LinkedList<Integer>();;

    public LeetCode225() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public static void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2.clear();
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
    }
}
