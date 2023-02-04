leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;


        TreeNode dummy = constructTree(nums,0,nums.length-1);
        return dummy;
    }
    TreeNode constructTree(int[] nums,int l,int h){
        if(l>h){
            return null;
        }
        int m = l + ((h-l)/2);
        TreeNode right = constructTree(nums,m+1,h);
        TreeNode left = constructTree(nums,l,m-1);
        return new TreeNode(nums[m],left,right);
    }
}
