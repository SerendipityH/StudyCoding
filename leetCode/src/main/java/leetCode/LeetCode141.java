package leetCode;

import java.util.HashSet;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/26 18:44
 */
public class LeetCode141 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while (head!=null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
