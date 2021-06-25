package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/25 21:10
 */
public class LeetCode16 {
    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        int diff =nums[0]+nums[1]+nums[2];

        for(int i = 0;i<length;i++){
            int left = i +1;
            int right = length -1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(target-diff)){
                    diff=sum;
                }
                if(sum>target){
                    right--;
                }
                if(sum<target){
                    left++;
                }else{
                    return diff;
                }

            }
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{0,2,1,-3},1));
    }
}
