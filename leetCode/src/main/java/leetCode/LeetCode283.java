package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/25 20:25
 */
public class LeetCode283 {
    public  static void moveZeroes(int[] nums) {
        int left = 0,right =0,temp =0;
        while (right<nums.length){
            if(nums[right] != 0){
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left ++;
            }
            right ++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
