/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode n=root;
        if(n==null || n==p ||n==q){
            return n;
        }
        TreeNode l=lowestCommonAncestor(n.left, p,q);
        TreeNode r=lowestCommonAncestor(n.right, p,q);
        if(l!=null && r!=null){
            return n;

        }
        return l!=null?l:r;
        
    }
}