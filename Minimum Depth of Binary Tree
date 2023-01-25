//link: https://leetcode.com/problems/minimum-depth-of-binary-tree/

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
    int min = Integer.MAX_VALUE;
    int c = 0;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        getheight(root);
        return min;
    }
    void getheight(TreeNode root){
        if(root == null){
            return;
        }
        c++;
        // int height = Math.max(left,right) +1;
        if(c < min && (root.left == null && root.right == null)){
            min = c;
        }
        getheight(root.left);
        getheight(root.right);
        c--;


    }
}
