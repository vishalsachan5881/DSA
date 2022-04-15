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
    public static boolean fn(TreeNode p,TreeNode q){
        
        if(p == null || q==null)
            return p==q;
        
        return p.val == q.val && fn(p.left,q.left) && fn(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return fn(p,q);
    }
}