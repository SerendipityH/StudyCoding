package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/14 19:57
 */
public class LeetCode38 {
    public static String countAndSay(int n) {
        String str ="1";
        for(int i =2;i<=n;i++){
            StringBuffer sb = new StringBuffer();
            int count = 0;
            for(int j = 0;j<str.length();j++){
                count ++;
                if(str.length()-1==j || str.charAt(j)!=str.charAt(j+1)){
                    sb.append(count);
                    sb.append(str.charAt(j));
                    count = 0;
                }
            }
            str = sb.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
