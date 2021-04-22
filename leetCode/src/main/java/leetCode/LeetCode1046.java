package leetCode;

import java.util.PriorityQueue;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/4/22 21:33
 */
public class LeetCode1046 {
    public static  int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int stone : stones){
            pq.offer(stone);
        }
        while (pq.size() > 1){
           int a = pq.poll();
           int b = pq.poll();
          if (a > b){
               pq.offer(a-b);
           }
        }
        return pq.isEmpty() ? 0 :pq.poll();
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
