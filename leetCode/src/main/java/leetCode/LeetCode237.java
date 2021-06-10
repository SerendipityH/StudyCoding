package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/10 22:59
 */
public class LeetCode237 {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {
        ListNode preNode = node;
        if(preNode != null){
            preNode.next =preNode.next.next;
            preNode.val = preNode.next.val;
        }
    }
}
