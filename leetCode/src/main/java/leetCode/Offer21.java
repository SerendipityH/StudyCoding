package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/14 8:28
 */
public class Offer21 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int temp = 0;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
            } else {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        return nums;
    }
}
