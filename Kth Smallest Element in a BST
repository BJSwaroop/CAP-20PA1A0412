leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    int kth = 0,c =0;
    public int kthSmallest(TreeNode root, int k) {
        getk(root,k);
        // Stack<Node> s = new Stack<>();
        // s.push(root)
        return kth;

    }
    void getk(TreeNode root,int k){
        if(root == null){
            return;
        }
        getk(root.left,k);
        c++;
        if(c == k){
            kth = root.val;
        }
        getk(root.right,k);

    }
}
