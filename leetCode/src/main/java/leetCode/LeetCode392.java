package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/20 21:49
 */
public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {
        int i = s.length();
        int j = t.length();
        int m=0,n=0;
        while (m < i && n < j){
            if(s.charAt(m)==t.charAt(n)){
                m++;
            }
            n++;
        }
        return i==m;
    }
}
