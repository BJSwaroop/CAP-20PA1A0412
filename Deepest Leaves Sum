//link: https://leetcode.com/problems/deepest-leaves-sum/submissions/884265996/

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
    int height = 0;
    int sum = 0;
    int c = 1;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.right == null && root.left == null){
            return root.val;
        }

        height = getHeight(root);
        System.out.println("Height: " + height);
        getDeep(root);
        return sum;

    }
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left,right) + 1;
    }
    void getDeep(TreeNode root){
        if(root == null){
            return;
        }
            System.out.println(c);
        if(c == height){
            sum += root.val;
        }

        ++c;
        getDeep(root.left);
        --c;
        ++c;
        getDeep(root.right);
        --c;
    }
}
