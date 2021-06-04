package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/4 20:16
 */
public class LeetCode190 {
    public static int reverseBits(int n) {
        int ans = 0;
       for(int i = 0;i<32;i++){
           //res先往左移一位，把最后一个位置空出来，
           //用来存放n的最后一位数字
           ans <<= 1;
           //res加上n的最后一位数字（这里改成加法）
           ans += n & 1;
           //n往右移一位，把最后一位数字去掉
           n>>=1;
       }
       return ans;
    }


}
