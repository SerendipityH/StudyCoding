package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/21 20:56
 */
public class LeetCode633 {
    public static boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int i = left * left;
            int j = right * right;
            if (i + j == c) {
                return true;
            } else if (i + j > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(4));
    }
}
