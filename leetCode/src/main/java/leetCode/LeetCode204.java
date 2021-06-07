package leetCode;

import java.util.Arrays;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/7 21:45
 */
public class LeetCode204 {
    public static int countPrimes(int n) {
        int count = 0;
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for(int i = 2;i*i<n;i++){
            if(isPrim[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrim[j] =false;
                }
            }
        }
        for(int m = 2;m<isPrim.length;m++){
            if(isPrim[m]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(3));
    }
}
