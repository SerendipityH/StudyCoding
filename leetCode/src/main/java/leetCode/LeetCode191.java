package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/5 20:29
 */
public class LeetCode191 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n!=0){
            n&=n-1;
            ans++;
        }
        return ans;
    }
}
