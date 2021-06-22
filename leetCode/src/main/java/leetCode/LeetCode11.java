package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/22 21:37
 */
public class LeetCode11 {
    public static int maxArea(int[] height) {
        int sum = 0;
        int value = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            value= (right-left) * Math.min(height[left],height[right]);
            if(value>sum){
                sum=value;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
