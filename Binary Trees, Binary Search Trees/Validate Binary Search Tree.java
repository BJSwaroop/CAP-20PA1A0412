leetcode.com/problems/validate-binary-search-tree/

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
    public boolean isValidBST(TreeNode root) {
        return checkTree(root,null,null);
    }
    boolean checkTree(TreeNode root,Integer min,Integer max){
        if(root == null){
            return true;
        }
        if((max!= null && max<=root.val) ||( min != null && min>=root.val)){
            return false;
        }
        boolean left = checkTree(root.left,min,root.val);
        boolean right = checkTree(root.right,root.val,max);
        return left && right;
        



    }
}
