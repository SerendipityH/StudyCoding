package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/3 20:39
 */
public class LeetCode172 {
    public static int trailingZeroes(int n) {
        int i = 0;
        while (n>0){
            i+=n/5;
            n/=5;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }
}
