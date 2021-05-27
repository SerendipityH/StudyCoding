package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/27 19:33
 */
public class LeetCode122 {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int num : prices){
            if(num > minPrice){
                maxProfit += num - minPrice;
            }
            minPrice = num;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
