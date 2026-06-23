class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        List<Integer> temp = new ArrayList<>();

        int k = 0;

        while(!q.isEmpty()){

            TreeNode a = q.remove();

            if(a == null){

                if(k % 2 == 1){
                  //  Collections.reverse(temp);
                  List<Integer> rev = new ArrayList<>();

for(int i = temp.size() - 1; i >= 0; i--){
    rev.add(temp.get(i));
}

temp =rev;
                }

                ans.add(temp);

                if(q.isEmpty()){
                    break;
                }

                temp = new ArrayList<>();
                k++;

                q.add(null);
            }
            else{

                temp.add(a.val);

                if(a.left != null){
                    q.add(a.left);
                }

                if(a.right != null){
                    q.add(a.right);
                }
            }
        }

        return ans;
    }
}
