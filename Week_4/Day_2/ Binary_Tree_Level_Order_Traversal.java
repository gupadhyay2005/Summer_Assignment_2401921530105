
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>>  ans = new  ArrayList<>();
        List<Integer> temp = new ArrayList<>();
     
if(root == null){
    return ans;
}
     q.add(root);
     q.add(null);


     while(!q.isEmpty()){
        TreeNode  a = q.remove();



        if( a == null){
            ans.add(temp);
            if(q.isEmpty()){
                break;
            }
            else{
                
           temp= new ArrayList<>();
           q.add(null); 


            }



        }else{
           temp.add(a.val);
           if(a.left!= null){
            q.add(a.left);
           }
           if(a.right!= null){
            q.add(a.right);
           }

        }

   }
   return ans;
        
    }
}


    











  
