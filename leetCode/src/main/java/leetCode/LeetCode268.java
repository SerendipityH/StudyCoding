package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/12 11:16
 */
public class LeetCode268 {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int totalSize = nums.length+1;
        for(int i = 0;i<=totalSize;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
