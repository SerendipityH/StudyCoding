package leetCode;

import java.util.*;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/14 20:31
 */
public class LeetCode496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i :nums2){
            while (!stack.isEmpty() &&stack.peek() < i){
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        int[] value = new int[nums1.length];
        for(int i = 0; i< nums1.length;i++){
           value [i] = map.getOrDefault(nums1[i], -1);
        }
        return value;
    }

    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1,nums2));
    }
}
