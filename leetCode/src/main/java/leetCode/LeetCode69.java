package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/16 11:23
 */
public class LeetCode69 {
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        //System.out.println(Math.sqrt(Integer.MAX_VALUE));
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(mySqrt(Integer.MAX_VALUE));
    }
}
