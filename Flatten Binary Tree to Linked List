leetcode.com/problems/flatten-binary-tree-to-linked-list/description/


class Solution {
    
    Queue<TreeNode> q = new LinkedList<>();
    public void flatten(TreeNode root) {
            getTree(root);
            
            TreeNode temp = root;
            temp = q.poll();
            temp = root;
            while(!q.isEmpty()){
                temp.right = q.poll();
                temp.left = null;
                temp = temp.right;
            }

        }
    
    void getTree(TreeNode t){
        if(t == null){
            return;
        }
        q.add(t);
        getTree(t.left);
        getTree(t.right);
        return;
    }
}
