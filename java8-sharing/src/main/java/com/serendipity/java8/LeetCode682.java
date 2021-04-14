package com.serendipity.java8;

import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/13 21:10
 */
public class LeetCode682 {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String str:ops){
            switch (str){
                case "C":
                    stack.pop();
                    break;
                case "+":
                    stack.push(stack.get(stack.size()-1)+stack.get(stack.size()-2));
                    break;
                case "D":
                    stack.push(stack.get(stack.size()-1)*2);
                    break;
                default:
                    stack.push(Integer.valueOf(str));
                    break;
            }
        }
        Integer value = 0;
        for(int i:stack ){
            value = value + i;
        }
        return value;
    }

    public static void main(String[] args) {
        String str[] = {"5","2","C","D","+"};
        System.out.println(calPoints(str));
    }
}
