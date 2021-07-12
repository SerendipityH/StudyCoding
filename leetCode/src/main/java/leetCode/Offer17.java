package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/12 21:27
 */
public class Offer17 {
    public int[] printNumbers(int n) {
        int num = (int) Math.pow(10, n);
        int[] arr = new int[num - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
