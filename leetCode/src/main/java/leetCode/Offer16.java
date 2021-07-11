package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/11 22:17
 */
public class Offer16 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / (x * myPow(x, -n - 1));
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x, n - 1);
        }
    }
}
