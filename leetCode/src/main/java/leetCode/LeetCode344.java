package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/14 9:41
 */
public class LeetCode344 {
    public static void reverseString(char[] s) {
        char temp;
        int midLength = s.length/2;
        for(int i=0;i<midLength;i++){
            temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
}
