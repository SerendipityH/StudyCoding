package leetCode;

import java.util.List;
import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/28 21:09
 */
public class LeetCode19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode first = head;
        ListNode second = node;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while(first != null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return node.next;
    }

}
