package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/21 21:44
 */
public class LeetCode06218 {
    public static int myAtoi(String s) {

        s = s.trim();
        if(s.equals("")){
            return 0;
        }
        int res = 0;
        int sign = 1;
        StringBuilder str = new StringBuilder();
        if (Character.isLetter(s.charAt(0))) {
            return 0;
        }
        int index =0;
        if(s.charAt(0)=='+'){
            index++;
        }
        if (s.charAt(0) == '-') {
            index ++;
            sign = -1;
        }

        for (int i = index; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar > '9' || currChar < '0') {
                break;
            }

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            res = res * 10 + sign * (currChar - '0');
        }

        return res;
    }

    public static void main(String[] args) {
       System.out.println(myAtoi(" "));
       /* char s = '.';
        System.out.println(s<= '9' && s >= '0');*/
    }
}
