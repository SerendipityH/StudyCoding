package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/1 22:16
 */
public class LeetCode160 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        while(p != q){
            p = p != null? p.next:headB;
            q = q == null? headA:q.next;
        }
        return p;
    }
}
