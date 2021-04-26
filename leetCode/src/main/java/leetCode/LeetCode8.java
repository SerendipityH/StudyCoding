package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/26 19:41
 */
public class LeetCode8 {
    public static int reverse(int x) {
        int res = 0;
        while (x != 0){
            int temp = x%10;
            if(res >Integer.MAX_VALUE/10 || (x== Integer.MAX_VALUE&&temp>7) ){
                return 0;
            }
            if(res<-Integer.MIN_VALUE/10||(x==-Integer.MIN_VALUE&&temp<-8)){
                return 0;
            }
            res = res *10+temp;
            x /=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
       // System.out.println(7123%10);

    }
}
