package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/8 22:29
 */
public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }else {
                set.add(num);
            }
        }
        return false;
    }
}
