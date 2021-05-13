package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/13 21:38
 */
public class LeetCode26 {
    public static  int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        int length = nums.length;
        int j = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,3}));
    }
}
