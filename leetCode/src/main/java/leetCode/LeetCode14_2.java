package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/9 22:15
 */
public class LeetCode14_2 {
    public int cuttingRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        long ans = 1;
        while (n > 4) {
            ans = ans * 3 % 1000000007;
            n -= 3;
        }
        return (int) (ans * n % 1000000007);
    }
}
