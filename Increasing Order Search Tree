leetcode.com/problems/increasing-order-search-tree/description/



class Solution {
    TreeNode temp;
    public TreeNode increasingBST(TreeNode root) {
            
            TreeNode node = new TreeNode(0);
            temp = node;
            getTree(root);
            return node.right;
        }
    
    public void getTree(TreeNode t){
        if(t == null){
            return;
        }
        getTree(t.left);
        t.left = null;
        temp.right = t;
        temp = temp.right;
        // temp = t;
        getTree(t.right);
    }
}
