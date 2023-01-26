leetcode.com/problems/binary-tree-maximum-path-sum/description/

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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int max2 = getSum(root);
            return Math.max(max, max2);
        }
        int getSum(TreeNode root){
            if(root == null){
            return 0;
        }     
        int left = getSum(root.left);
        int right = getSum(root.right);
        if(left == 0 && right == 0){
            max = Math.max(max,root.val);
            return root.val;
        }
        else if(left==0){
            max = Math.max(Math.max(max,root.val+right),root.val);
            return Math.max(root.val,root.val+right);
        }
        else if(right==0){
            max = Math.max(Math.max(max,root.val+left),root.val);
            return Math.max(root.val,root.val+left);
        }
        else{
            int throughNode = root.val + left + right;
            int throughRight = root.val + right;
            int throughLeft = root.val + left;

            max = Math.max(throughNode, max);
            max = Math.max(max, Math.max(root.val, Math.max(throughLeft,throughRight)));
        System.out.println(max);
            return Math.max(root.val, Math.max(throughLeft,throughRight));
        }
    }
}
