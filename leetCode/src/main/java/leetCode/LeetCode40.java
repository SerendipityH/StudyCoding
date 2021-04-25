package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/25 21:24
 */
public class LeetCode40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int num[] = new int[k];
        Arrays.sort(arr);
        for(int i= 0;i<k;i++){
            num[i] = arr[i];
        }
        return num;
    }
}
