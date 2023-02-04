leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {0};
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return getTree(map,preorder,inorder,arr,0,inorder.length-1);
    }
    TreeNode getTree(HashMap<Integer,Integer> map,int[] preorder,int[] inorder,int[] arr,int l,int h){
        if(l>h ){
            return null;
        }
        int k = map.get(preorder[arr[0]]);
        int val  = preorder[arr[0]++];
        TreeNode left = getTree(map,preorder,inorder,arr,l,k-1);
        TreeNode right = getTree(map,preorder,inorder,arr,k+1,h);
        TreeNode newNode = new TreeNode( val , left, right);
        return newNode;
    }


}
