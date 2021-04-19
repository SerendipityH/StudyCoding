package com.serendipity.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/18 13:13
 */
public class LeetCode1544 {
    public static  String makeGood(String s) {
        StringBuffer sb = new StringBuffer();
        int index = -1;
        for(int i = 0;i<s.length();i++){
            if(sb.length()>0 && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(sb.charAt(index)) && s.charAt(i) !=sb.charAt(index)){

                sb.deleteCharAt(index);
                index --;
            }
            else {
                sb.append(s.charAt(i));
                index ++;
            }


        }


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
}
