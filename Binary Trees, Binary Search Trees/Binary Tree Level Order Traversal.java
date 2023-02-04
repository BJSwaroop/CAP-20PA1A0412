https://leetcode.com/problems/binary-tree-level-order-traversal/description/

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
    public List<List<Integer>> levelOrder(TreeNode t) {
        List<List<Integer>> result = new ArrayList<>();
        if(t == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(t);
        list.add(t.val);
        result.add(list);

        while(!q.isEmpty()){
            int size = q.size();
            list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    list.add(curr.left.val);
                    q.add(curr.left);
                }
                if(curr.right != null){
                    list.add(curr.right.val);
                    q.add(curr.right);
                }
            }
            if(list.size()>0)
                result.add(list);
        }
        return result;


    }
}
