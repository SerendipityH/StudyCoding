package leetCode;

import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/15 21:23
 */
public class LeetCode1598 {
    public static int minOperations(String[] logs) {
        Stack<Integer> stack = new Stack<>();
        for(String str :logs){
            if(str.equals("./")){
                continue;
            }
            else if(str.equals("../")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(1);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
       String[] logs = {"d1/","../","../","../"};
        System.out.println(minOperations(logs));
    }
}
