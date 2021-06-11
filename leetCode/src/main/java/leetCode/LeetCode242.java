package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/11 20:31
 */
public class LeetCode242 {
    public  static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.get(s.charAt(i))==null?1:map1.get(s.charAt(i)) + 1);
        }
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.get(t.charAt(i))==null?1:map2.get(t.charAt(i)) + 1);

        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","anagram"));
    }
}
