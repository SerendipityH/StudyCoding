package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/21 22:09
 */
public class LeetCode703 {
    int k;
    PriorityQueue<Integer> pq;
    public LeetCode703(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int num :nums){
            add(num);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k){
            return pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        LeetCode703 leetCode703 = new LeetCode703(3, new int[]{4, 5, 8, 2});
        System.out.println(leetCode703.add(3));
    }
}
