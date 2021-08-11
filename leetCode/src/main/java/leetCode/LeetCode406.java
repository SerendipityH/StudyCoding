package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/11 19:17
 */
public class LeetCode406 {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] arr : people) {
            list.add(arr[1], arr);
        }
        return list.toArray(new int[list.size()][]);
    }
}
