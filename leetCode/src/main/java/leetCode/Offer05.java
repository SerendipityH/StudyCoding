package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/1 8:32
 */
public class Offer05 {
    public static String replaceSpace(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            str.append(s.charAt(i)==' '?"%20":s.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
