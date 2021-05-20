package leetCode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/19 22:18
 */
public class LeetCode94 {

     // Definition for a binary tree node.
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }
    public void inorder(TreeNode treeNode,List<Integer> res){
          if(treeNode==null){
              return;
          }
          inorder(treeNode.left,res);
          res.add(treeNode.val);
          inorder(treeNode.right,res);
    }


}
