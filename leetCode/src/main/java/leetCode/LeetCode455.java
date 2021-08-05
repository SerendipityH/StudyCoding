package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/5 22:21
 */
public class LeetCode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 ,j = 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}
