practice.geeksforgeeks.org/problems/sum-of-leaf-nodes/1
class GfG
{
    int sum = 0;
    public int SumofLeafNodes(Node root)
    {
        // your code here
        int s = getSum(root);
        return sum;
        
    }
    int getSum(Node root){
        if(root == null){
            return 0;
        }
        int left = getSum(root.left);
        int right = getSum(root.right);
        
        if(left == 0 && right == 0){
            sum+=root.data;
        }
        return root.data;
    }
}
