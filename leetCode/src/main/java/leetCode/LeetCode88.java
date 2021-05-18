package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/18 20:08
 */
public class LeetCode88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        while(n>0&&m>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[n+m-1]=nums1[m-1];
                m--;
            }else{
                nums1[n+m-1]=nums2[n-1];
                n--;
            }
        }
        for(int i=0;i<n;i++){
            nums1[i]=nums2[i];
        }
        return nums1;
     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{0,0,0,0,0}, 0, new int[]{2, 5, 6,7}, 4)));
    }
}
