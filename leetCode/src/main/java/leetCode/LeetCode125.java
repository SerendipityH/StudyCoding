package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/31 18:38
 */
public class LeetCode125 {
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0;i<s.length();i++){
           if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));

           }
       }
        StringBuilder reverse = new StringBuilder(stringBuilder).reverse();
        return reverse.toString().equals( stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}
