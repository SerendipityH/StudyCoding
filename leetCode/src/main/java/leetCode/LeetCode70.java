package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/17 18:57
 */
public class LeetCode70 {

    public static int climbStairs(int n) {
        int ans =1,p=0,q=0;
        for(int i = 1;i<=n;i++){
            p=q;
            q=ans;
            ans = p+q;

        }

       return ans;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
