package leetCode;

import java.util.PriorityQueue;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/27 21:52
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for(int num:nums){
            priorityQueue.add(num);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
