package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/14 19:41
 */
public class LeetCode35 {
    public static int searchInsert(int[] nums, int target) {
        if (nums==null){
            return 0;
        }
        for(int i = 0 ;i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},0));
    }
}
