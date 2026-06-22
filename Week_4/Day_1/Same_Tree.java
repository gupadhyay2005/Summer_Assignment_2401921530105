class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checking(p, q);
    }

    public Boolean checking(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        Boolean x = isSameTree(p.left, q.left);
        Boolean y = isSameTree(p.right, q.right);

        if (x && y) {
            return true;
        } else {
            return false;
        }
    }
}
