package leetCode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/22 20:44
 */
public class LeetCode345 {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int left = 0;
        int right = s.length() - 1;
        char result[] = new char[s.length()];
        while (left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!vowels.contains(leftChar)) {
                result[left++] = leftChar;
            } else if (!vowels.contains(rightChar)) {
                result[right--] = rightChar;
            } else {
                result[left++] = rightChar;
                result[right--] = leftChar;
            }
        }
        return new String(result);
    }
}

