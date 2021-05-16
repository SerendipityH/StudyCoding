package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/16 10:47
 */
public class LeetCode66 {
    public  static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1;i>=0;i--){
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
    }
}