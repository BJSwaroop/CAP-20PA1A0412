leetcode.com/problems/balanced-binary-tree/description/

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
    boolean ch = true;
    public boolean isBalanced(TreeNode root) {
        int dummy = getBalanced(root);
        return ch;
    }
    int getBalanced(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getBalanced(root.left);
        int right = getBalanced(root.right);
        if(Math.abs(left-right)>1){
            ch = false;
        }
        return Math.max(left,right)+1;
    }
}
