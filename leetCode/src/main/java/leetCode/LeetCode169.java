package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/29 19:07
 */
public class LeetCode169 {

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer element = null;
        for(int num:nums){
            if(count == 0){
                element = num;
            }
            if(element == num){
                count++;
            }else {
                count--;
            }

        }
        return element;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{6,5,5}));
    }
}
