class Solution {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return solve(root.left, root.right);
    }

    public boolean solve(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

     boolean x =solve(left.left, right.right);
     boolean y = solve(left.right, right.left);
     if(x && y){
        return true;
     }else{
        return false;
     }
    }
}
