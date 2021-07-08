package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/8 9:01
 */
public class LeetCode14_1 {
   /* public int cuttingRope(int n) {
        int[] arr = new int[n + 1];
        arr[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 2; j < i; j++) {
                arr[i] = Math.max(arr[i], Math.max(j * (i - j), j * arr[i - j]));
            }
        }
        return arr[n];
    }*/
   public int cuttingRope(int n) {
       if (n < 4) {
           return n - 1;
       }
       int ans = 1;
       while (n > 4) {
           ans *= 3;
           n -= 3;
       }
       return ans * n;
   }
}
