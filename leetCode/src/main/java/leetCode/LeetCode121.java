package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/24 20:04
 */
public class LeetCode121 {

    public static int maxProfit(int[] prices) {
        int minPrice =prices[0];
        int maxPro = 0;
        for(int num:prices){
            if(num<minPrice){
                minPrice = num;
            }else if(num-minPrice>maxPro){
                maxPro = num -minPrice;
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
