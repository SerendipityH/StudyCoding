package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/12 12:28
 */
public class LeetCode763 {
    public static List<Integer> partitionLabels(String s) {
        int[] lastIndexOfChar = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndexOfChar[s.charAt(i) - 'a'] = i;
        }
        List<Integer> list = new ArrayList<>();
        int firstIndex = 0;
        while (firstIndex < s.length()) {
            int lastIndex = firstIndex;
            for (int i = firstIndex; i < s.length() && i <= lastIndex; i++) {
                int index = lastIndexOfChar[s.charAt(i) - 'a'];
                if (index > lastIndex) {
                    lastIndex = index;
                }
            }
            list.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("abaaggggtt"));
    }
}
