package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/13 22:23
 */
public class LeetCode326 {
    public static boolean isPowerOfThree(int n) {
       if(n<1){
           return false;
       }
       while (n%3==0){
           n/=3;
       }
       return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
