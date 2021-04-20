package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/15 21:45
 */
public class LeetCode1441 {
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1,j=0;i <= n&&j<target.length;i++){
            if(i<target[j]){
                list.add("Push");
                list.add("Pop");
            }
            if(i == target[j]){
                list.add("Push");
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{ 2,3,4},4));
    }
}
