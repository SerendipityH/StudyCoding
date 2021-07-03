package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/3 21:33
 */
public class LeetCode105 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }



    static Map<Integer,Integer> map = new HashMap<Integer,Integer>();;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;

        for(int i = 0;i<length;i++){
            map.put(inorder[i],i);
        }
        return buildNode(preorder,inorder,0,length-1,0,length-1);
    }
    public static TreeNode buildNode(int[] preorder,int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right){
        if(preorder_left > preorder_right){
            return null;
        }
        int preorder_root = preorder_left;
        int inorder_root = map.get(preorder[preorder_root]);

        TreeNode node = new TreeNode(preorder[preorder_root]);

        int leftSize = inorder_root - inorder_left;

        node.left=buildNode(preorder,inorder,preorder_left+1,preorder_left+leftSize,inorder_left,inorder_root-1);
        node.right=buildNode(preorder,inorder,preorder_left+leftSize+1,preorder_right,inorder_root+1,inorder_right);
        return node;

    }

    public static void main(String[] args) {
        System.out.println(buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7}));
    }
}
