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
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            
            int s=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                ans.add(p.val);

                if(p.left !=null){
                    q.offer(p.left);
                }
                if(p.right !=null){
                    q.offer(p.right);
                }

            }
            res.add(ans);
            
        }
        return res;
        
    }
}