leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

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
    HashSet<Integer> set = new HashSet<>();
    boolean ch = false;
    public boolean findTarget(TreeNode root, int k) {

        getElems(root,k);
        return ch;
    }
    void getElems(TreeNode root, int k){
        if(root == null) return;

        if(!set.contains(root.val)){
            set.add(k-root.val);
        }
        else{
            ch = true;
        }
        getElems(root.left,k);
        getElems(root.right,k);
    }
}
