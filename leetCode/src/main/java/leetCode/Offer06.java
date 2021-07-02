package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/2 8:16
 */
public class Offer06 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        int size = stack.size();
        int[] nums = new int[size];
        for(int i = 0;i<size;i++){
            nums[i]=stack.pop();
        }
        return nums;
    }

}
