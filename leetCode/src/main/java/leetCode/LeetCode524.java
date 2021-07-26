package leetCode;

import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/26 20:44
 */
public class LeetCode524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String longestStr = "";
        for (String str : dictionary) {
            int length1 = str.length();
            int length2 = longestStr.length();
            if (length2 > length1 || (length1 == length2 && longestStr.compareTo(str) < 0)) {
                continue;
            }
            if (isVaild(s, str)) {
                longestStr = str;
            }
        }
        return longestStr;
    }

    public boolean isVaild(String s, String str) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < str.length()) {
            if (s.charAt(i) == str.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == str.length();
    }
}
