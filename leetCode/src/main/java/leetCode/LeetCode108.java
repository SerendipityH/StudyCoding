package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/5/22 20:45
 */
public class LeetCode108 {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums,0,nums.length-1);
    }
    public TreeNode sort(int[] nums,int left ,int right){
        if(left >right){
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sort(nums,left,mid-1);
        treeNode.right = sort(nums,mid+1,right);
        return treeNode;
    }
}
