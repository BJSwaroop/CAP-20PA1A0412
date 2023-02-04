/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    String s = "";
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);

        return root.val + " " + left + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] a = data.split(" ");
        if(a[0] == ""){
            return null;
        }
        int[] preorder = new int[a.length];

            // System.out.println(a.length);
        for (int i=0; i < a.length; i++)
        {
            preorder[i] = Integer.parseInt(a[i]);
            // System.out.println(a[i]);
        }
        return bstFromPreorder(preorder);

    }
    TreeNode bstFromPreorder(int[] preorder){
        
        return buildTree(preorder,Integer.MAX_VALUE,new int[]{0});

    }
    TreeNode buildTree(int[] preorder, int max,int[] i){

        if(i[0] == preorder.length){
            return null;
        }
        if(preorder[i[0]] > max){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left = buildTree(preorder,root.val,i);
        root.right = buildTree(preorder,max,i);
        
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
