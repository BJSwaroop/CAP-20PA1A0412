https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/

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
    int c = 0;
    public int averageOfSubtree(TreeNode root) {
        int dummy = getSum(root);
        return c;
    }
    int getSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftsum = getSum(root.left);
        int rightsum = getSum(root.right);
        int currSum = leftsum + rightsum + root.val;
        if(currSum/getCount(root) == root.val){
            c++;
        }
        return currSum;
    }
    int getCount(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getCount(root.left);
        int right = getCount(root.right);
        return left + right +1;
    }
}
