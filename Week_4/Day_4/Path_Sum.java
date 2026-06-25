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
  
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
        if(root != null){sum = root.val;}
     return    path(root , targetSum , sum);
        
        
    }
    public boolean  path(TreeNode root , int targetSum ,  int sum){
        if(root ==null){
            return false;
        }
        
        if(sum ==targetSum && root.left ==null && root.right == null ){
            return true;
        }
       
        int y ;
        int z ;
        if(root.left!= null){ y = root.left.val;}
        else{
            y= 0;
        }
              
        Boolean x = path(root.left , targetSum ,sum+ y);
         if(root.right!= null){
             z = root.right.val;
        }else{
            z = 0;
        } 
         Boolean a = path(root.right , targetSum ,sum+ z);
     
       return x || a;
    }
}
