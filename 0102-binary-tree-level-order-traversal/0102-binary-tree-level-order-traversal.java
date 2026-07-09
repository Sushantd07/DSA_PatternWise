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
    public int height(TreeNode root){
        if(root==null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left,right);
    }

    public void level(TreeNode root,int n,List<Integer> list){
      if(root==null) return;

      if(n==1) {
        list.add(root.val);
        return;
      }

      level(root.left,n-1,list);
      level(root.right,n-1,list);
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();

        int h = height(root);

        for(int i=1;i<=h;i++){
             List<Integer> list = new ArrayList<>();
            level(root,i,list);
            ans.add(list);
        }

        return ans;
    }
}