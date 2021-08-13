package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/8/13 21:06
 */
public class LeetCode605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0, len = flowerbed.length; i < len && n > 0;) {
            if(flowerbed[i] == 1 ){
                i+=2;
            }
            else if(i==length -1 || flowerbed[i+1]==0){
                i+=2;
                n--;
            }else {
                i+=3;
            }

        }
        return n<=0;
    }
}
