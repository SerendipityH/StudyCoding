package leetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/10 20:26
 */
public class LeetCode452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        Arrays.sort(points, (p1, p2) -> p1[1] < p2[1] ? -1 : 1);
        int cnt = 1;
        int right = points[0][1];
        for(int i = 1;i<points.length;i++){
            if(points[i][0]>right){
                cnt++;
                right = points[i][1];
            }

        }
        return cnt;
    }
}
