package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/4 9:34
 */
public class Offer10 {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
