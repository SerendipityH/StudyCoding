package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/18 14:11
 */
public class Offer25 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode node = null;
        if (l1.val <= l2.val) {
            node = l1;
            l1.next = mergeTwoLists(l1.next, l2);
        } else {
            node = l2;
            l2.next = mergeTwoLists(l1, l2.next);
        }
        return node;
    }
}
