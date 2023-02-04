practice.geeksforgeeks.org/problems/perfect-binary-tree/1

class Solution{
    boolean ch = true;
    public boolean isPerfect(Node root){
        //code here
        int height = getHeight(root);
        return ch;
    }
    int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left != right){
            ch = false;
        }
        return Math.max(left,right) +1;
    }
}
