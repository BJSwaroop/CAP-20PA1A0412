//link: https://leetcode.com/problems/path-sum/description/
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
    int sum = 0;
    boolean ch = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        getSum(root,targetSum);
        return ch;
    }
    void getSum(TreeNode root, int k){
        if(root == null){
            
            return;
        }
        sum+=root.val;
        if(sum == k && (root.left == null && root.right == null) ){
            ch = true;
        }
        System.out.println(sum);
        getSum(root.left,k);
        getSum(root.right,k);
        sum -= root.val;

    }
}
