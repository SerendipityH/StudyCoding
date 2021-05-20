package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/20 18:48
 */
public class LeetCode101 {
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
    public boolean isSymmetric(TreeNode root) {
        return inorder(root,root);
    }
    public boolean inorder(TreeNode p,TreeNode q){
        if(p == null && q== null){
            return true;
        }
        if(p == null || q==null){
            return false;
        }
        return p.val == q.val && inorder(p.left,q.right) && inorder(p.right,q.left);
    }
}
