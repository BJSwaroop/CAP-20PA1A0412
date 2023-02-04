leetcode.com/problems/subtree-of-another-tree/description/

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
    boolean ch1 = true;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
       if(root == null){
           return false;
       }
       return root.val == subRoot.val && isSameTree(root.left,subRoot.left)

    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q==null){
            return true;
        }
        else if(p==null || q==null){
            return false;
        }
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);

        return left && right && p.val == q.val;

    }
    
}
