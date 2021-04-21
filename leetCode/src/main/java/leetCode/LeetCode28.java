package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/21 21:50
 */
public class LeetCode28 {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return  0;
        }
        int i = haystack.indexOf(needle);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaaaa","bba"));
    }
}
