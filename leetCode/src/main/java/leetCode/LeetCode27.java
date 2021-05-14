package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/14 19:24
 */
public class LeetCode27 {
    public static int removeElement(int[] nums, int val) {
        int j =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
