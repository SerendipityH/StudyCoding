package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/27 19:59
 */
public class LeetCode9 {
    public static boolean isPalindrome(int x) {
        int res = 0;
        int temp = x;
        while (x > 0){

            res =  res*10+x%10;
            x/=10;
        }
        if(res == temp){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
