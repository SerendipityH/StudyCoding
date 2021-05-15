package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/15 20:48
 */
public class LeetCode53 {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for(int num : nums){
            if(sum>0){
                sum += num;
            }else {
                sum = num;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4,1}));
    }
}
