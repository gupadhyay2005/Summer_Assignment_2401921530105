class Solution {
    public TreeNode invertTree(TreeNode root) {
        return reverse(root);        
    }
    public TreeNode reverse (TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode lefta = reverse(root.left);
        TreeNode righta  =reverse(root.right);
    
         int data = root.val;
          root.left = righta;
          root.right = lefta;
     return root;
    }
}
