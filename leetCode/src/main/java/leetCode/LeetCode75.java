package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/4 21:46
 */
public class LeetCode75 {
    public void sortColors(int[] nums) {
        int i = -1,j = 0 ,k = nums.length;
        while(j < k){
            if(nums[j] == 0){
                swap(nums,++i,j++);
            }else if(nums[j]==2){
                swap(nums,--k,j);
            }else{
                ++j;
            }
        }
    }
    public void swap(int[] nums,int i , int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
