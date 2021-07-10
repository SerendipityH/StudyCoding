package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/10 13:40
 */
public class Offer15 {
    /* public int hammingWeight(int n) {
         int num = 0;
         while (n != 0) {
             num += n & 1;
             n >>>= 1;
         }
         return num;
     }*/
    public int hammingWeight(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n &= n - 1;
        }
        return num;
    }
}
