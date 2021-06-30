package leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/30 21:15
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int num = -1;
        for (int value : nums) {
            if (set.contains(value)) {
                return value;
            }
            set.add(value);
        }
        return num;
    }
}
