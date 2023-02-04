leetcode.com/problems/merge-two-binary-trees/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        return merge(root1,root2);
    }
    TreeNode merge(TreeNode r1,TreeNode r2){
        if(r1 == null && r2 == null){
            return null;
        }
        if(r1 == null){
            return r2;
        }if(r2 == null){
            return r1;
        }
        r1.val = r1.val+r2.val;
        TreeNode left = merge(r1.left,r2.left);
        TreeNode right = merge(r1.right,r2.right);
        r1.right = right;
        r1.left = left;
        return r1;
    }

}
