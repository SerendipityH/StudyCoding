package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/16 22:14
 */
public class Offer24 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;

    }
}
