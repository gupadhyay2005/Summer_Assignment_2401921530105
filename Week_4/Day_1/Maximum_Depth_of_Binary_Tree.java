
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;

class Solution {
    public int maxDepth(TreeNode root) {
        
    int range = leafnode(root);
    return range;

        
        
    }
    public int leafnode(TreeNode root){
        if(root == null){
            return 0;
        }

        int left  = leafnode(root.left);
        int right = leafnode(root.right);

        
    
            return (Math.max(left , right)) +1;
                   
    }
}
