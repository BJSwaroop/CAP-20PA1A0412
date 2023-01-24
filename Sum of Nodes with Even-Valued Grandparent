// link: https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/description/

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
    int sum;
    public int sumEvenGrandparent(TreeNode root) {
        getTraverse(root);
    //     map.remove(map.size());
    //     System.out.println(map);
    //     int gp = 1;
    //     int gc = 3;
    //     int sum = 0;
    // if(map.size() >= 3){
        
    //     while(gp<=map.size()-2){
    //         ArrayList<Integer> gpList = map.get(gp);
    //         ArrayList<Integer> gcList = map.get(gc);

    //         for(int i = 0;i<gpList.size();i++){
    //             System.out.println("GPSIZE: " + gpList.size() + " " + gcList.size());
    //             if(gpList.get(i)%2 == 0){

    //                 // int sep = gcList.size()/gpList.size() -1;
    //                 for(int j = 4*i; j< 4*i + 4;j++){
                        
    //                     // sum += gcList.get(j) > 0?gcList.get(j):0;
    //                     System.out.println("Nikendhuku " + j);
    //                 }

    //             }else{
    //                 continue;
    //             }
    //         }
    //         gp++;
    //         gc++;
    //     }

    // }
        return sum;
    }
    void getTraverse(TreeNode root){
        // if(map.containsKey(c)){
        //     ArrayList<Integer> list = new ArrayList<>();
        //     list = map.get(c);
        //     if(root == null){
        //         list.add(-1);
        //     }
        //     else{

        //     list.add(root.val);
        //     }
        //     map.put(c, list);
        // }else{
        //     ArrayList<Integer> list = new ArrayList<>();
        //     if(root == null){
        //         list.add(-1);
        //     }
        //     else{

        //     list.add(root.val);
        //     }
        //     map.put(c, list);
        // }
        
        if(root == null){
            return;
        }
        if(root.val%2 == 0){
            getSum(root.left, root.right);
        }
        getTraverse(root.left);
        getTraverse(root.right);
    }
    void getSum(TreeNode left, TreeNode right){
        if(left != null && left.left != null){
            sum += left.left.val;
        }
        if(left != null &&left.right != null){
            sum +=left.right.val;
        }
        if(right != null &&right.left != null){
            sum += right.left.val;
        }
        if(right != null &&right.right != null){
            sum += right.right.val;
        }
        
    }
}
