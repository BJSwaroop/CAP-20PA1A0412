leetcode.com/problems/symmetric-tree/

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
    boolean ch=true;
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right==null)){
            return true;
        }
        TreeNode temp1 = root.left;
        TreeNode temp2 = root.right;
       check(temp1,temp2);
        return ch;
    }
    void check(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return;
        
        else if(root1 == null || root2 == null){
            ch = false;
            return;
        }
      
        System.out.println(root1.val + " " + root2.val);
        if(root1.val != root2.val){
            ch = false;
        }
        check(root1.right,root2.left);
        check(root1.left,root2.right);
    }
}
