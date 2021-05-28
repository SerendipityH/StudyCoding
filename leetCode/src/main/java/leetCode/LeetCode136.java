package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/28 21:06
 */
public class LeetCode136 {
    public static int singleNumber(int[] nums) {
     /*   Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums){
            if(map.get(num) != null){
                map.put(num,2);
            }else {
                map.put(num,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key:value = " + entry.getKey() + ":" + entry.getValue());
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;*/
        int ans = 0;
        for(int num : nums){
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
}
