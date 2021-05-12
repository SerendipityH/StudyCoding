package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/12 19:27
 */
public class LeetCode21 {
    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2==null){
            return l1==null?l2:l1;
        }
        if(l1.val <l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        System.out.println();
    }
}
