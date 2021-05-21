package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/21 19:45
 */
public class LeetCode104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int leftDepth= maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth,rightDepth)+1;
        }
    }


}
