// link: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode temp = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        search(cloned,target);
        if(temp != null){
            return temp;
        }
        return null;

    }
    public void search(TreeNode root,TreeNode target){
        if(root == null){
            return;
        }
        if(root.val == target.val){
            temp = root;
            System.out.print(temp.val);
        }
        search(root.left,target );
        search(root.right,target);
    }
}
