package leetCode;

import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/9 22:54
 */
public class LeetCode234 {
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

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp1 = head;
        ListNode temp2 = head;
        while (temp1 != null) {
            stack.push(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            if (temp2.val != stack.pop()) {
                return false;
            }
            temp2 = temp2.next;
        }
        return true;
    }
}
