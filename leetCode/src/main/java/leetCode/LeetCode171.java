package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/2 20:06
 */
public class LeetCode171 {
    public static int titleToNumber(String columnTitle) {
        int ans= 0;
        for(int i = 0;i<columnTitle.length();i++){
            int num = columnTitle.charAt(i) - 'A' + 1;
            ans = ans*26+num;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "A";
        System.out.println(titleToNumber("CZ"));
    }
}
