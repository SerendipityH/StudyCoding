package leetCode;

import java.util.*;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/20 22:00
 */
public class LeetCode20 {
    public static boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0){
            return false;
        }
        Deque<Character> stack = new LinkedList<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(int i = 0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.peek()!=map.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
