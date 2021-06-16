package leetCode;

import java.util.*;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/16 21:20
 */
public class LeetCode387 {
    public  static int firstUniqChar(String s) {
       Map<Character, Integer> map = new HashMap<>();
       for(int i = 0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       for(int i = 0;i<s.length();i++){
           if(map.get(s.charAt(i))==1){
               return i;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
