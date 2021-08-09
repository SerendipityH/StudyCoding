package leetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/9 22:16
 */
public class LeetCode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        int cnt = 1;
        int right = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]>=right){
                ++cnt;
                right = intervals[i][1];
            }

        }
        return intervals.length -cnt;
    }
}
